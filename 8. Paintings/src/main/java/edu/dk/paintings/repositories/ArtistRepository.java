package edu.dk.paintings.repositories;

import edu.dk.paintings.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//CrudRepository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
