package ru.prikhodko.dossier.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.dossier.entities.Book;

//@NoRepositoryBean
public interface BookRepository extends JpaRepository<Book, Long> {
}
