package es.seteruiz.tiernonews.services;

import es.seteruiz.tiernonews.models.Author;
import es.seteruiz.tiernonews.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthor(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> findByAgeLessThanEqual(Integer age) {
        return authorRepository.findByAgeLessThanEqual(age);
    }
}
