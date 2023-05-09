package com.github.alecmus.springboot3webapp.repositories;

import com.github.alecmus.springboot3webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
