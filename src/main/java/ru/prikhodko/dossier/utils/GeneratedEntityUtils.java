package ru.prikhodko.dossier.utils;

import ru.prikhodko.dossier.entities.*;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneratedEntityUtils {

    private static final Random random = new Random();
    private static final int countOfChild = 100;
    private static final int countOfParent = 100;

    public static Set<Library> getLibraries() {
        return IntStream.range(0, random.nextInt(countOfParent)).mapToObj(GeneratedEntityUtils::getLibrary).collect(Collectors.toSet());
    }

    private static Library getLibrary(int i) {
        Library library = new Library();
        library.setName("Name " + i);
        library.setBooks(getBooks());
        library.setBranches(getBranches());
        library.setDepartments(getDepartment());
        library.setReaders(getReader());
        library.setReadingRooms(getReadingRoom());
        library.setSuppliers(getSupplier());
        return library;
    }

    public static Set<Book> getBooks() {
        return IntStream.range(0, random.nextInt(countOfChild)).mapToObj(GeneratedEntityUtils::getBook).collect(Collectors.toSet());
    }

    private static Book getBook(int i) {
        Book book = new Book();
        book.setAuthor("Author name " + i);
        book.setTitle("Title " + i);
        return book;
    }

    public static Set<Branch> getBranches() {
        return IntStream.range(0, random.nextInt(countOfChild)).mapToObj(GeneratedEntityUtils::getBranch).collect(Collectors.toSet());
    }

    private static Branch getBranch(int i) {
        Branch branch = new Branch();
        branch.setName("Name " + i);
        return branch;
    }

    public static Set<Department> getDepartment() {
        return IntStream.range(0, random.nextInt(countOfChild)).mapToObj(GeneratedEntityUtils::getDepartment).collect(Collectors.toSet());
    }

    private static Department getDepartment(int i) {
        Department department = new Department();
        department.setName("Name " + i);
        return department;
    }

    public static Set<Reader> getReader() {
        return IntStream.range(0, random.nextInt(countOfChild)).mapToObj(GeneratedEntityUtils::getReader).collect(Collectors.toSet());
    }

    private static Reader getReader(int i) {
        Reader reader = new Reader();
        reader.setName("Name " + i);
        return reader;
    }

    public static Set<ReadingRoom> getReadingRoom() {
        return IntStream.range(0, random.nextInt(countOfChild)).mapToObj(GeneratedEntityUtils::getReadingRoom).collect(Collectors.toSet());
    }

    private static ReadingRoom getReadingRoom(int i) {
        ReadingRoom readingRoom = new ReadingRoom();
        readingRoom.setName("Name " + i);
        return readingRoom;
    }

    public static Set<Supplier> getSupplier() {
        return IntStream.range(0, random.nextInt(countOfChild)).mapToObj(GeneratedEntityUtils::getSupplier).collect(Collectors.toSet());
    }

    private static Supplier getSupplier(int i) {
        Supplier supplier = new Supplier();
        supplier.setName("Name " + i);
        return supplier;
    }
}
