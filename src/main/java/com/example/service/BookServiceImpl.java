package com.example.service;

import com.example.entity.BookEntity;
import com.example.repository.BookRepository;
import com.example.repository.BookRepositoryImpl;

import java.util.List;

public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl() {
        this.bookRepository = new BookRepositoryImpl();
    }

    @Override
    public List<BookEntity> getAll() {
        return this.bookRepository.getAll();
    }

    @Override
    public void add(BookEntity bookEntity) {
        bookRepository.add(bookEntity);
    }

}
