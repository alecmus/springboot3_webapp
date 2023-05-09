package com.github.alecmus.springboot3webapp.repositories;

import com.github.alecmus.springboot3webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
