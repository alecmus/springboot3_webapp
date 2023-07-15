package com.github.alecmus.springboot3webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/*
 * The @Entity annotation is for mapping this class to a table, with each field
 * corresponding to a column within that table. Each camelCase field is mapped
 * to a snake_case column, e.g. publisherName is mapped to publisher_name.
 */
@Entity
public class Publisher {
    /*
     * The @Id annotation marks this field as the primary key.
     * The @GeneratedValue(strategy = GenerationType.AUTO) causes the framework
     * to create this field's value for us automatically. The framework will ensure that
     * each generated value is unique.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    /*
     * The @OneToMany annotation here indicates that one publisher has many books. Note that
     * the 'mappedBy' is only required on one side of the relationship. As such, it is not necessary
     * to add 'mappedBy = 'books'' to the publisher field in the Book class.
     */
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;

        return getId() != null ? getId().equals(publisher.getId()) : publisher.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}
