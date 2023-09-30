package com.example.servlet;

import com.example.service.BookService;
import com.example.service.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddBookServlet extends HttpServlet {

    private BookService bookService;

    public AddBookServlet() {
        this.bookService = new BookServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();

        String numberOfPage = req.getParameter("numberOfPage");
        String title = req.getParameter("title");
        String releaseYear = req.getParameter("releaseYear");

        session.setAttribute("numberOfPage", numberOfPage);
        session.setAttribute("title", title);
        session.setAttribute("releaseYear", releaseYear);

        req.getRequestDispatcher("/WEB-INF/addbook.jsp").forward(req, resp);

    }

}
