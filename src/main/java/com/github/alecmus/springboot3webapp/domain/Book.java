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
public class Book {
    /*
     * The @Id annotation marks this field as the primary key.
     * The @GeneratedValue(strategy = GenerationType.AUTO) causes the framework
     * to create this field's value for us automatically. The framework will ensure that
     * each generated value is unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isbn;

    /*
     * This creates a join table named 'author_book'. The join columns are this entity's
     * id and the author entity's id and shall as denoted by 'book_id' and 'author_id', respectively.
     * Therefore, the 'author_book' table will have two columns named 'book_id' and 'author_id' and
     * each will respond to the primary key from the respective source table.
     *
     * The join table is created according to the many-to-many relationship between the
     * authors field in this class and the books field in the Author class. The mapping is enabled by
     * the use of 'mappedBy = "authors"' added to the books field in the Author class. Note that the
     * 'mappedBy' is only required on one side of the relationship.
     */
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    /*
     * The @ManyToOne annotation here indicates that many Books have one Publisher. The first
     * part, i.e. '@Many...' is in reference to the class we are in. Note that it is not necessary to
     * add the 'mappedBy = 'books'' here since a 'mappedBy' clause is available in the Publisher class.
     * The 'mappedBy' is only necessary on one side of the relationship.
     */
    @ManyToOne
    private Publisher publisher;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", authors=" + authors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return getId() != null ? getId().equals(book.getId()) : book.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
