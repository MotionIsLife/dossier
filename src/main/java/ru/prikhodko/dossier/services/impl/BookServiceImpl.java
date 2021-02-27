package ru.prikhodko.dossier.services.impl;

import org.springframework.stereotype.Service;
import ru.prikhodko.dossier.dao.BookRepository;
import ru.prikhodko.dossier.entities.Book;
import ru.prikhodko.dossier.services.BookService;
import ru.prikhodko.dossier.utils.GeneratedEntityUtils;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    public BookServiceImpl(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void generate() {
        //GeneratedEntityUtils.getLibraries().forEach(repository::save);
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Book> getBYId() {
        return Optional.empty();
    }
}
