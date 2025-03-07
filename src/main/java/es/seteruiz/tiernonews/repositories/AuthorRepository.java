package es.seteruiz.tiernonews.repositories;

import es.seteruiz.tiernonews.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByAgeLessThanEqual(Integer age);
}
