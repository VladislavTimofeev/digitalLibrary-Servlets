package com.example.service;

import com.example.entity.BookEntity;
import com.example.exception.ServiceException;
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
    public void add(BookEntity bookEntity) throws ServiceException {
        validateBook(bookEntity);
        bookRepository.add(bookEntity);
    }

    private void validateBook(BookEntity bookEntity) throws ServiceException {

//        if (isEmpty(bookEntity.getTitle())) {
//            throw new ServiceException("Book title is required");
//        }

        if (bookEntity.getTitle() == null || bookEntity.getTitle().isEmpty() || bookEntity.getTitle().equals(" ")) {
            return;
        } else if (bookEntity.getTitle().length() <= 3) {
            return;
        }

        if (bookEntity.getNumberOfPage() <= 10) {
            return;
        }

        if (bookEntity.getReleaseYear() < 1500 || bookEntity.getReleaseYear() >= 2024) {
            return;
        }

    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

}
