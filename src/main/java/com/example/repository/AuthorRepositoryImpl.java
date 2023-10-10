package com.example.repository;

import com.example.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {

    private List<AuthorEntity> author = new ArrayList<>();

    public AuthorRepositoryImpl() {
        long id = (long) (Math.random() * 51 + 6);
        AuthorEntity author1 = new AuthorEntity(1L, "Joanne", "Rowling");
        AuthorEntity author2 = new AuthorEntity(2L, "Dale", "Carnegie");
        author.add(author1);
        author.add(author2);
    }

    @Override
    public List<AuthorEntity> getAll() {
        return author;
    }

    @Override
    public boolean add(AuthorEntity authorEntity) {
        return author.add(authorEntity);
    }
}
