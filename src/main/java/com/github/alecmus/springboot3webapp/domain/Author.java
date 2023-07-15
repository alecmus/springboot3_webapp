package com.github.alecmus.springboot3webapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

/*
 * The @Entity annotation is for mapping this class to a table, with each field
 * corresponding to a column within that table. Each camelCase field is mapped
 * to a snake_case column, e.g. firstName is mapped to first_name.
 */
@Entity
public class Author {
    /*
     * The @Id annotation marks this field as the primary key.
     * The @GeneratedValue(strategy = GenerationType.AUTO) causes the framework
     * to create this field's value for us automatically. The framework will ensure that
     * each generated value is unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    /*
     * The @ManyToMany annotation here indicates that the 'books' field has a many-to-many
     * relationship with the 'authors' field in the Author entity.
     */
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;

        return getId() != null ? getId().equals(author.getId()) : author.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
