package ru.prikhodko.dossier.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity(name = "Library")
public class Library {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "library")
    private Set<Book> books = new HashSet<>();

    @OneToMany(mappedBy = "library")
    private Set<Department> departments = new HashSet<>();

    @OneToMany(mappedBy = "library")
    private Set<ReadingRoom> readingRooms = new HashSet<>();

    @OneToMany(mappedBy = "library")
    private Set<Reader> readers = new HashSet<>();

    @OneToMany(mappedBy = "library")
    private Set<Supplier> suppliers = new HashSet<>();

    @OneToMany(mappedBy = "library")
    private Set<Branch> branches = new HashSet<>();

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

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    public Set<ReadingRoom> getReadingRooms() {
        return readingRooms;
    }

    public void setReadingRooms(Set<ReadingRoom> readingRooms) {
        this.readingRooms = readingRooms;
    }

    public Set<Reader> getReaders() {
        return readers;
    }

    public void setReaders(Set<Reader> readers) {
        this.readers = readers;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Objects.equals(id, library.id) && Objects.equals(name, library.name) && Objects.equals(books, library.books) && Objects.equals(departments, library.departments) && Objects.equals(readingRooms, library.readingRooms) && Objects.equals(readers, library.readers) && Objects.equals(suppliers, library.suppliers) && Objects.equals(branches, library.branches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, books, departments, readingRooms, readers, suppliers, branches);
    }
}