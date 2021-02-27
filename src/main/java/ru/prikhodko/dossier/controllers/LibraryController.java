package ru.prikhodko.dossier.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.prikhodko.dossier.entities.Library;
import ru.prikhodko.dossier.services.LibraryService;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String generateData() {
        System.out.println("start generate data");
        libraryService.generate();
        return "ok";
    }

    @GetMapping
    public List<Library> findAll() {
        return libraryService.findAll();
    }

}
