package ru.prikhodko.dossier.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.dossier.entities.Department;

//@NoRepositoryBean
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
