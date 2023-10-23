package com.example.service;

import com.example.entity.BookEntity;
import com.example.exception.ServiceException;
import com.example.repository.BookRepository;
import com.example.repository.BookRepositoryImpl;

import java.time.LocalDate;
import java.util.List;

public class BookServiceImpl implements BookService {

    private static final int MIN_TITLE_LENGTH = 3;
    private static final int MIN_NUMBER_PAGES = 10;
    private final BookRepository bookRepository;
    private static final int currentYear = LocalDate.now().getYear();
    private static final int startYear = 1500;

    public BookServiceImpl() {
        this.bookRepository = new BookRepositoryImpl();
    }

    @Override
    public List<BookEntity> getAll() {
        return this.bookRepository.getAll();
    }

    @Override
    public void add(BookEntity bookEntity) throws ServiceException {
        validate(bookEntity);
        bookRepository.add(bookEntity);
    }

    public void validate(BookEntity bookEntity) throws ServiceException {

        if (isEmpty(bookEntity.getTitle())) {
            throw new ServiceException("You need to add book title");
        } else if (bookEntity.getTitle().length() <= MIN_TITLE_LENGTH) {
            throw new ServiceException("Need at least three letters");
        } else if (bookEntity.getNumberOfPage() <= MIN_NUMBER_PAGES) {
            throw new ServiceException("You need more pages!");
        } else if (bookEntity.getReleaseYear() < startYear || bookEntity.getReleaseYear() >= currentYear) {
            throw new ServiceException("Invalid year");
        }

    }

    private boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

}
