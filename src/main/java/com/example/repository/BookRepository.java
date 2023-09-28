package com.example.repository;

import com.example.entity.BookEntity;

import java.util.List;

public interface BookRepository {

    List<BookEntity> getAll();

    boolean add(BookEntity bookEntity);

}
