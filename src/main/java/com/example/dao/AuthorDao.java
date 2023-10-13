package com.example.dao;

import com.example.entity.AuthorEntity;

import java.util.List;

public interface AuthorDao {

    List<AuthorEntity> getAll();

    void save(AuthorEntity authorEntity);

}
