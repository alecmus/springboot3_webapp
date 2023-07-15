package com.github.alecmus.springboot3webapp.repositories;

import com.github.alecmus.springboot3webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/*
 * The CrudRepository takes two generics, the type to be stored in the database
 * and the type of its primary key. It comes with lots of built-in functionality
 * for most of the common SQL operations that we would ever want to perform. This
 * means we don't have to write SQL statements except in very remote cases.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
