package es.seteruiz.tiernonews.controllers;

import es.seteruiz.tiernonews.models.Author;
import es.seteruiz.tiernonews.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("author")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    //localhost:8080/author/5
    @GetMapping("author/{id}")
    public Author getAuthor(@PathVariable Long id) {
        return authorService.getAuthor(id);
    }

    //localhost:8080/author?id=5
    @GetMapping("authorTest")
    public Author getAuthorTest(@RequestParam Long id) {
        return authorService.getAuthor(id);
    }

    @PostMapping("author")
    public Author createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    @GetMapping("authorAge")
    public List<Author> findByAgeLessThanEqual(@RequestParam Integer age) {
        return authorService.findByAgeLessThanEqual(age);
    }
}
