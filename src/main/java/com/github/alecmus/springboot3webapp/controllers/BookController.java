package com.github.alecmus.springboot3webapp.controllers;

import com.github.alecmus.springboot3webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controllers are components that handle web requests. They transform user input into a model
 * that is presented to the user by the view.
 */
@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    /*
     * This method will be called when the user calls the '/books' address,
     * i.e., http:localhost:8080/books
     * The model associated with the request will be automatically injected by Spring. Here
     * we add an attribute to that model whose key is 'books' and whose value is a list
     * of books (an Iterable in this case). The template engine will be able to see this
     * data in the .html template file (books.html in this case).
     * The return value is the name of the template file under
     * /resources/templates (minus the file extension).
     */
    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }
}
