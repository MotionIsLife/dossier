package ru.prikhodko.dossier.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "Library")
public class Library {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "library")
    private Set<Book> books = new HashSet<>();

    public Library() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}