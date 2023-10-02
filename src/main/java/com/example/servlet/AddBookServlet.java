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
import java.util.ArrayList;
import java.util.List;

public class AddBookServlet extends HttpServlet {

    private BookService bookService;

    public AddBookServlet() {
        this.bookService = new BookServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();

//        String id = req.getParameter("id");
//        String numberOfPage = req.getParameter("numberOfPage");
//        String title = req.getParameter("title");
//        String releaseYear = req.getParameter("releaseYear");

        long id = Long.parseLong(req.getParameter("id"));
        int numberOfPage = Integer.parseInt(req.getParameter("numberOfPage"));
        String title = req.getParameter("title");
        int releaseYear = Integer.parseInt("releaseYear");


        BookEntity book = new BookEntity(id, numberOfPage, title, releaseYear);

        book.setId(id);
        book.setNumberOfPage(numberOfPage);
        book.setTitle(title);
        book.setReleaseYear(releaseYear);

        req.setAttribute("book",book);

//        session.setAttribute("id",book);
//        session.setAttribute("numberOfPage",book);
//        session.setAttribute("title",book);
//        session.setAttribute("releaseYear",book);


//        session.setAttribute("numberOfPage", numberOfPage);
//        session.setAttribute("title", title);
//        session.setAttribute("releaseYear", releaseYear);

        req.getRequestDispatcher("/WEB-INF/addbook.jsp").forward(req, resp);

    }

}
