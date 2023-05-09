package com.github.alecmus.springboot3webapp.repositories;

import com.github.alecmus.springboot3webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
