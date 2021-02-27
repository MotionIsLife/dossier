package ru.prikhodko.dossier.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.dossier.entities.Supplier;

//@NoRepositoryBean
public interface SupplierRoomRepository extends JpaRepository<Supplier, Long> {
}
