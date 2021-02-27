package ru.prikhodko.dossier.services.impl;

import org.springframework.stereotype.Service;
import ru.prikhodko.dossier.dao.*;
import ru.prikhodko.dossier.entities.*;
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
    private final BranchRepository branchRepository;
    private final DepartmentRepository departmentRepository;
    private final ReaderRepository readerRepository;
    private final ReadingRoomRepository readingRoomRepository;
    private final SupplierRoomRepository supplierRoomRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository, BookRepository bookRepository, BranchRepository branchRepository, DepartmentRepository departmentRepository, ReaderRepository readerRepository, ReadingRoomRepository readingRoomRepository, SupplierRoomRepository supplierRoomRepository) {
        this.libraryRepository = libraryRepository;
        this.bookRepository = bookRepository;
        this.branchRepository = branchRepository;
        this.departmentRepository = departmentRepository;
        this.readerRepository = readerRepository;
        this.readingRoomRepository = readingRoomRepository;
        this.supplierRoomRepository = supplierRoomRepository;
    }

    @Override
    @Transactional
    public void generate() {
        Set<Library> libraries = GeneratedEntityUtils.getLibraries();
        libraries.forEach(l -> {
            Library save = libraryRepository.save(l);
            Set<Book> updatedBooks = l.getBooks().stream().peek(book -> book.setLibrary(save)).collect(Collectors.toSet());
            Set<Branch> updatedBranches = l.getBranches().stream().peek(branch -> branch.setLibrary(save)).collect(Collectors.toSet());
            Set<Department> updatedDepartment = l.getDepartments().stream().peek(department -> department.setLibrary(save)).collect(Collectors.toSet());
            Set<Reader> updatedReader = l.getReaders().stream().peek(reader -> reader.setLibrary(save)).collect(Collectors.toSet());
            Set<ReadingRoom> updatedReadingRoom = l.getReadingRooms().stream().peek(readingRooms -> readingRooms.setLibrary(save)).collect(Collectors.toSet());
            Set<Supplier> updatedSupplier = l.getSuppliers().stream().peek(supplier -> supplier.setLibrary(save)).collect(Collectors.toSet());
            bookRepository.saveAll(updatedBooks);
            branchRepository.saveAll(updatedBranches);
            departmentRepository.saveAll(updatedDepartment);
            readerRepository.saveAll(updatedReader);
            readingRoomRepository.saveAll(updatedReadingRoom);
            supplierRoomRepository.saveAll(updatedSupplier);
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
