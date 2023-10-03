package com.example.repository;

import com.example.entity.BookEntity;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private List<BookEntity> books = new ArrayList<>();

    public BookRepositoryImpl() {
        BookEntity book = new BookEntity(1L, 333, "Harry", 2001);
        BookEntity book2 = new BookEntity(2L, 345, "Henry", 2020);
        books.add(book);
        books.add(book2);
    }

    @Override
    public List<BookEntity> getAll() {
        return books;
    }

    @Override
    public boolean add(BookEntity bookEntity) {
        return books.add(bookEntity);
    }

}

