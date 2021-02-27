package ru.prikhodko.dossier.services;

import ru.prikhodko.dossier.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    void generate();
    List<Book> findAll();
    Optional<Book> getBYId();
}
