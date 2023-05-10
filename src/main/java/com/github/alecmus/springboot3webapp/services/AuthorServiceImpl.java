package com.github.alecmus.springboot3webapp.services;

import com.github.alecmus.springboot3webapp.domain.Author;
import com.github.alecmus.springboot3webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
