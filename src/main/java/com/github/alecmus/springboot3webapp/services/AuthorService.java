package com.github.alecmus.springboot3webapp.services;

import com.github.alecmus.springboot3webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
