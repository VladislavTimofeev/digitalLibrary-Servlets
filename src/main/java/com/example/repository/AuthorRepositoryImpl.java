package com.example.repository;

import com.example.dao.AuthorDao;
import com.example.dao.AuthorDaoImpl;
import com.example.entity.AuthorEntity;

import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {

    private AuthorDao authorDao;

    public AuthorRepositoryImpl() {
        this.authorDao = new AuthorDaoImpl();
    }

    @Override
    public List<AuthorEntity> getAll() {
        return this.authorDao.getAll();
    }

    @Override
    public boolean add(AuthorEntity authorEntity) {
        this.authorDao.save(authorEntity);
        return true;
    }
}
