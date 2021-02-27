package ru.prikhodko.dossier.services.impl;

import org.springframework.stereotype.Service;
import ru.prikhodko.dossier.dao.BookRepository;
import ru.prikhodko.dossier.dao.LibraryRepository;
import ru.prikhodko.dossier.entities.Book;
import ru.prikhodko.dossier.entities.Library;
import ru.prikhodko.dossier.services.LibraryService;
import ru.prikhodko.dossier.utils.GeneratedEntityUtils;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LibraryServiceImpl implements LibraryService {

    private final LibraryRepository libraryRepository;
    private final BookRepository bookRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository, BookRepository bookRepository) {
        this.libraryRepository = libraryRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional
    public void generate() {
        Set<Library> libraries = GeneratedEntityUtils.getLibraries();
        libraries.forEach(l -> {
            Library save = libraryRepository.save(l);
            Set<Book> updatedBooks = l.getBooks().stream().peek(book -> book.setLibrary(save)).collect(Collectors.toSet());
            bookRepository.saveAll(updatedBooks);
        });
    }

    @Override
    public List<Library> findAll() {
        return libraryRepository.findAll();
    }

    @Override
    public Optional<Library> getBYId() {
        return Optional.empty();
    }
}
