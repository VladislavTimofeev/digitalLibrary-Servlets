package com.example.service;

import com.example.entity.AuthorEntity;

import java.util.List;

public interface AuthorService {

    List<AuthorEntity> getAll();

    void add(String firstName, String lastName);
}
