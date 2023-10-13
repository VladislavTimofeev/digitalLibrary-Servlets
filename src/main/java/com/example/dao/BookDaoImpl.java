package com.example.dao;

import com.example.entity.BookEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    private static final String INSERT_BOOK = "INSERT INTO books(number_of_pages, title, release_year) VALUES (?,?,?)";
    private static final String GET_ALL_BOOK = "SELECT id,number_of_pages,title,release_year FROM books";
    private final String URL = "jdbc:postgresql://localhost:5432/digitalLibrary";
    private final String USER = "postgres";
    private final String PASSWORD = "testing321";

    public BookDaoImpl() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    @Override
    public void save(BookEntity bookEntity) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            statement = connection.prepareStatement(INSERT_BOOK);
            statement.setInt(1, bookEntity.getNumberOfPage());
            statement.setString(2, bookEntity.getTitle());
            statement.setInt(3, bookEntity.getReleaseYear());

            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    private BookEntity getNextBook(ResultSet set) throws SQLException {
        long id = set.getLong(1);
        int numberOfPages = set.getInt(2);
        String title = set.getString(3);
        int releaseYear = set.getInt(4);

        return new BookEntity(id, numberOfPages, title, releaseYear);
    }

    @Override
    public List<BookEntity> getAll() {

        Connection connection = null;
        PreparedStatement statement = null;

        List<BookEntity> books = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.prepareStatement(GET_ALL_BOOK);

            ResultSet set = statement.executeQuery();
            while (set.next()) {
                BookEntity book = getNextBook(set);
                books.add(book);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

        return books;
    }
}




