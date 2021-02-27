package ru.prikhodko.dossier.utils;

import ru.prikhodko.dossier.entities.Book;
import ru.prikhodko.dossier.entities.Library;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratedEntityUtils {

    private static final Random random = new Random();

    public static Set<Library> getLibraries() {
        return IntStream.range(0, random.nextInt(20)).mapToObj(GeneratedEntityUtils::getLibrary).collect(Collectors.toSet());
    }

    private static Library getLibrary(int i) {
        Library library = new Library();
        library.setName("Name " + i);
        library.setBooks(getBooks());
        return library;
    }

    public static Set<Book> getBooks() {
        return IntStream.range(0, random.nextInt(20)).mapToObj(GeneratedEntityUtils::getBook).collect(Collectors.toSet());
    }

    private static Book getBook(int i) {
        Book book = new Book();
        book.setAuthor("Author name " + i);
        book.setTitle("Title " + i);
        return book;
    }
}
