package ru.prikhodko.dossier.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.dossier.entities.Reader;

//@NoRepositoryBean
public interface ReaderRepository extends JpaRepository<Reader, Long> {
}
