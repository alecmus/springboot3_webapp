package com.github.alecmus.springboot3webapp.services;

import com.github.alecmus.springboot3webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
