package ru.prikhodko.dossier.services;

import ru.prikhodko.dossier.entities.Library;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    void generate();
    List<Library> findAll();
    Optional<Library> getBYId();
}
