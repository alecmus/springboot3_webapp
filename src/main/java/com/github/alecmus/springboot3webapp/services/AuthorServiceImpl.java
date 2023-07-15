package com.github.alecmus.springboot3webapp.services;

import com.github.alecmus.springboot3webapp.domain.Author;
import com.github.alecmus.springboot3webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    /*
     * When only one constructor exists, Spring automatically injects the
     * required parameters. That means Spring will first make instances of the
     * required parameters before making an instance of this class. In this case,
     * Spring will create an instance of the AuthorRepository first, then inject it
     * into the AuthorServiceImpl constructor.
     */
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        /*
         * Note that the ...Repository.findAll() method is provided for us. We never implemented
         * the AuthorRepository; Spring does the implementation for us and provides a bunch of
         * common CRUD operations right out-of-the-box.
         */
        return authorRepository.findAll();
    }
}
