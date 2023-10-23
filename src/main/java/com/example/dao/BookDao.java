package com.example.dao;

import com.example.entity.BookEntity;

import java.util.List;

public interface BookDao {

    void save(BookEntity bookEntity);

    List<BookEntity> getAll();
}
