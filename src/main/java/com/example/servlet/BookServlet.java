package com.example.servlet;

import com.example.entity.BookEntity;
import com.example.exception.ServiceException;
import com.example.service.BookService;
import com.example.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {

    private BookService bookService;

    public BookServlet() {
        this.bookService = new BookServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        final String action = req.getParameter("action");

        if (("add_new_book").equals(action)) {
            req.getRequestDispatcher("/WEB-INF/add_new_book.jsp").forward(req, resp);
        } else {
            HttpSession session = req.getSession();
            List<BookEntity> bookEntities = bookService.getAll();
            session.setAttribute("books", bookEntities);
            req.getRequestDispatcher("/WEB-INF/books.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        BookEntity book = new BookEntity();
        HttpSession session = req.getSession();

        int numberOfPage = Integer.parseInt(req.getParameter("numberOfPage"));
        String title = req.getParameter("title");
        int releaseYear = Integer.parseInt(req.getParameter("releaseYear"));

        book.setNumberOfPage(numberOfPage);
        book.setTitle(title);
        book.setReleaseYear(releaseYear);

        try {
            bookService.add(book);
        } catch (ServiceException e) {
            System.out.println("Invalid data");;
        }

        req.setAttribute("book", book);
        resp.sendRedirect("bookServlet?action=books");
        //req.getRequestDispatcher("/WEB-INF/books.jsp").forward(req, resp);

    }


}
