package com.example.junit.service;

import com.example.entity.BookEntity;
import com.example.exception.ServiceException;
import com.example.service.BookServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookServiceImplTest {

    BookServiceImpl bookService = new BookServiceImpl();

    @Test
    public void validateInvalidTitle() throws ServiceException {

        BookEntity invalidBookEntity = new BookEntity();

        invalidBookEntity.setTitle("");

        try {
            bookService.validate(invalidBookEntity);
        } catch (ServiceException e) {
            assertEquals("You need to add book title", e.getMessage());
        }

    }
    @Test
    public void validateInvalidNumberOfPage() throws ServiceException {

        BookEntity invalidBookEntity = new BookEntity();

        invalidBookEntity.setTitle("Harry Potter");
        invalidBookEntity.setNumberOfPage(0);

        try {
            bookService.validate(invalidBookEntity);
        } catch (ServiceException e) {
            assertEquals("You need more pages!", e.getMessage());
        }

    }
    @Test
    public void validateInvalidYear() throws ServiceException {

        BookEntity invalidBookEntity = new BookEntity();

        invalidBookEntity.setTitle("Harry Potter");
        invalidBookEntity.setNumberOfPage(1890);
        invalidBookEntity.setReleaseYear(2050);

        try {
            bookService.validate(invalidBookEntity);
        } catch (ServiceException e) {
            assertEquals("Invalid year", e.getMessage());
        }

    }
    @Test
    public void validateValidData() throws ServiceException {

        BookEntity invalidBookEntity = new BookEntity();

        invalidBookEntity.setTitle("Harry Potter");
        invalidBookEntity.setNumberOfPage(1890);
        invalidBookEntity.setReleaseYear(2020);

        try {
            bookService.validate(invalidBookEntity);
        } catch (ServiceException e) {
            assertEquals("Data is valid", e.getMessage());
        }

    }

}
