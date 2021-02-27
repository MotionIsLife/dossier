package ru.prikhodko.dossier.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.dossier.entities.Branch;

//@NoRepositoryBean
public interface BranchRepository extends JpaRepository<Branch, Long> {
}
