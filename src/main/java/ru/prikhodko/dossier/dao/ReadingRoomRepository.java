package ru.prikhodko.dossier.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.prikhodko.dossier.entities.ReadingRoom;

//@NoRepositoryBean
public interface ReadingRoomRepository extends JpaRepository<ReadingRoom, Long> {
}
