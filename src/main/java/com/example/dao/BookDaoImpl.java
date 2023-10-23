package com.example.dao;

import com.example.dao.pool.ConnectionPool;
import com.example.entity.BookEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.dao.DaoUtil.execute;

public class BookDaoImpl implements BookDao {

    private static final String INSERT_BOOK = "INSERT INTO books(number_of_pages, title, release_year) VALUES (?,?,?)";
    private static final String GET_ALL_BOOK = "SELECT id,number_of_pages,title,release_year FROM books";


    @Override
    public void save(BookEntity bookEntity) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionPool.getConnection();

            statement = connection.prepareStatement(INSERT_BOOK);
            statement.setInt(1, bookEntity.getNumberOfPage());
            statement.setString(2, bookEntity.getTitle());
            statement.setInt(3, bookEntity.getReleaseYear());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            execute(connection, statement);
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
            connection = ConnectionPool.getConnection();
            statement = connection.prepareStatement(GET_ALL_BOOK);

            ResultSet set = statement.executeQuery();
            while (set.next()) {
                BookEntity book = getNextBook(set);
                books.add(book);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            execute(connection, statement);
        }

        return books;
    }
}




