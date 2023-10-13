package com.example.repository;

import com.example.dao.BookDao;
import com.example.dao.BookDaoImpl;
import com.example.entity.BookEntity;

import java.util.List;


public class BookRepositoryImpl implements BookRepository {

    private BookDao bookDao;

    public BookRepositoryImpl() {
        this.bookDao = new BookDaoImpl();
    }

    @Override
    public List<BookEntity> getAll() {
        return this.bookDao.getAll();
    }

    @Override
    public boolean add(BookEntity bookEntity) {
        this.bookDao.save(bookEntity);
        return true;
    }

}

