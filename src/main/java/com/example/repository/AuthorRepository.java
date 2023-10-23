package com.example.repository;

import com.example.entity.AuthorEntity;

import java.util.List;

public interface AuthorRepository {

    List<AuthorEntity> getAll();

    boolean add(AuthorEntity authorEntity);
}
