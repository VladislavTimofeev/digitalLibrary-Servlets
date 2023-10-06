package com.example.service;

import com.example.entity.AuthorEntity;
import com.example.repository.AuthorRepository;
import com.example.repository.AuthorRepositoryImpl;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl() {
        this.authorRepository = new AuthorRepositoryImpl();
    }

    @Override
    public List<AuthorEntity> getAll() {
        return this.authorRepository.getAll();
    }

    @Override
    public void add(String firstName, String lastName) {
        authorRepository.add(new AuthorEntity());
    }
}
