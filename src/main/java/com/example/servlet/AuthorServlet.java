package com.example.servlet;

import com.example.entity.AuthorEntity;
import com.example.entity.BookEntity;
import com.example.service.AuthorService;
import com.example.service.AuthorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/authorServlet")
public class AuthorServlet extends HttpServlet {

    private AuthorService authorService;

    public AuthorServlet() {
        this.authorService = new AuthorServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        final String action = req.getParameter("action");

        if (("add_new_author").equals(action)) {
            req.getRequestDispatcher("/WEB-INF/add_new_author.jsp").forward(req, resp);
        } else {
            HttpSession session = req.getSession();
            List<AuthorEntity> authorEntities = authorService.getAll();
            session.setAttribute("authors", authorEntities);
            req.getRequestDispatcher("/WEB-INF/authors.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        AuthorEntity author = new AuthorEntity();
        HttpSession session = req.getSession();

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        author.setFirstName(firstName);
        author.setLastName(lastName);

        authorService.add(author);

        req.setAttribute("author", author);
        resp.sendRedirect("authorServlet?action=author");
        //req.getRequestDispatcher("/WEB-INF/add_new_author.jsp").forward(req, resp);

    }

}
