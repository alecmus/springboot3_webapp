package com.github.alecmus.springboot3webapp.controllers;

import com.github.alecmus.springboot3webapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controllers are components that handle web requests. They transform user input into a model
 * that is presented to the user by the view.
 */
@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    /*
     * This method will be called when the user calls the '/authors' address,
     * i.e., http:localhost:8080/authors
     * The model associated with the request will be automatically injected by Spring. Here
     * we add an attribute to that model whose key is 'authors' and whose value is a list
     * of authors (an Iterable in this case). The template engine will be able to see this
     * data in the .html template file (authors.html in this case).
     * The return value is the name of the template file under
     * /resources/templates (minus the file extension).
     */
    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorService.findAll());
        return "authors";
    }
}
