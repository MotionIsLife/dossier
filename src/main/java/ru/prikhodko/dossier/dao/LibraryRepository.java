package ru.prikhodko.dossier.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.prikhodko.dossier.entities.Library;

import java.util.List;

//@NoRepositoryBean
public interface LibraryRepository extends JpaRepository<Library, Long> {

    @Query("select l from Library l join fetch l.books")
    List<Library> findAllWithFetch();
}
