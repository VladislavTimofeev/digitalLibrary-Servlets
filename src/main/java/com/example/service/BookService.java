package com.example.service;

import com.example.entity.BookEntity;
import com.example.exception.ServiceException;

import java.util.List;

public interface BookService {

    List<BookEntity> getAll();

    void add(BookEntity bookEntity) throws ServiceException;

}
