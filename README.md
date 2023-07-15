# springboot3_webapp
 Spring Boot 3 Web App

This is a simple Spring 6/Spring Boot 3 application that demonstrates how Spring MVC (Model-View-Controller) can be used to build a simple web application.

This application contains the following:
- three domain, namely Author, Book and Publisher.
- Three repositories, each for the respective domain.
- Two services for the Book and Author.
- Two controllers for getting the list of books and authors via html.

The repositories use the CrudRepository and store data to an in-memory H2 database. Thymeleaf is used as the template engine for the view.

Demonstrated in this project are the following:
- Dependency injection
- Using a template engine
- Using database mappings
- Defining and implementing a service
- Responding to user requests through controllers
- Using the CommandLineRunner to bootstrap data

Two URLs can be accessed once the app is running:
1. http://localhost:8080/authors: displays a table listing the authors in the database
2. http://localhost:8080/books: displays a table listing the books in the database
