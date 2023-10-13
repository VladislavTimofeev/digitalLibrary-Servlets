package com.example.dao;

import com.example.dao.pool.ConnectionPool;
import com.example.entity.AuthorEntity;
import com.example.entity.BookEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.example.dao.DaoUtil.execute;

public class AuthorDaoImpl implements AuthorDao {

    private static final String INSERT_AUTHOR = "INSERT INTO authors(first_name, last_name) VALUES (?,?)";
    private static final String GET_ALL_AUTHORS = "SELECT id,first_name,last_name FROM authors";

    @Override
    public void save(AuthorEntity authorEntity) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionPool.getConnection();

            statement = connection.prepareStatement(INSERT_AUTHOR);
            statement.setString(1, authorEntity.getFirstName());
            statement.setString(2, authorEntity.getLastName());

            statement.executeUpdate();

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            execute(connection, statement);
        }
    }

    private AuthorEntity getNextBook(ResultSet set) throws SQLException {

        long id = set.getLong(1);
        String firstName = set.getString(2);
        String lastName = set.getString(3);

        return new AuthorEntity(id, firstName, lastName);
    }


    @Override
    public List<AuthorEntity> getAll() {

        Connection connection = null;
        PreparedStatement statement = null;

        List<AuthorEntity> authors = new ArrayList<>();

        try {
            connection = ConnectionPool.getConnection();
            statement = connection.prepareStatement(GET_ALL_AUTHORS);

            ResultSet set = statement.executeQuery();
            while (set.next()) {
                AuthorEntity author = getNextBook(set);
                authors.add(author);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            execute(connection, statement);
        }

        return authors;

    }

}
