package com.example.servlet;

import com.example.entity.BookEntity;
import com.example.service.BookService;
import com.example.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class BookServlet extends HttpServlet {

    private BookService bookService;

    public BookServlet() {
        this.bookService = new BookServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        List<BookEntity> bookEntities = bookService.getAll();
        session.setAttribute("books", bookEntities);
        req.getRequestDispatcher("/WEB-INF/books.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        BookEntity book = new BookEntity();
        HttpSession session = req.getSession();

        long id = Long.parseLong(req.getParameter("id"));
        int numberOfPage = Integer.parseInt(req.getParameter("numberOfPage"));
        String title = req.getParameter("title");
        int releaseYear = Integer.parseInt("releaseYear");

        book.setId(id);
        book.setNumberOfPage(numberOfPage);
        book.setTitle(title);
        book.setReleaseYear(releaseYear);

        req.setAttribute("book",book);
        req.getRequestDispatcher("/WEB-INF/books.jsp").forward(req, resp);

    }


}
