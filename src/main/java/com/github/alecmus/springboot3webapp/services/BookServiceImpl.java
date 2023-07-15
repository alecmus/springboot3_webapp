package com.github.alecmus.springboot3webapp.services;

import com.github.alecmus.springboot3webapp.domain.Book;
import com.github.alecmus.springboot3webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    /*
     * When only one constructor exists, Spring automatically injects the
     * required parameters. That means Spring will first make instances of the
     * required parameters before making an instance of this class. In this case,
     * Spring will create an instance of the BookRepository first, then inject it
     * into the BookServiceImpl constructor.
     */
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        /*
         * Note that the ...Repository.findAll() method is provided for us. We never implemented
         * the AuthorRepository; Spring does the implementation for us and provides a bunch of
         * common CRUD operations right out-of-the-box.
         */
        return bookRepository.findAll();
    }
}
