package com.github.alecmus.springboot3webapp.services;

import com.github.alecmus.springboot3webapp.domain.Author;

/*
 * A service is a component that provides some business logic. It is best defined as
 * an interface so that we can be able to swap the implementation by injecting
 * a different implementation as a Bean. Note that we are not using any Spring annotations
 * on the service itself but rather on its implementations.
 */
public interface AuthorService {
    Iterable<Author> findAll();
}
