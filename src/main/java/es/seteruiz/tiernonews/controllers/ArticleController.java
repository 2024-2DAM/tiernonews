package es.seteruiz.tiernonews.controllers;

import es.seteruiz.tiernonews.models.Article;
import es.seteruiz.tiernonews.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/article")
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping("/")
    public String prueba() {
        return "Hola mundoooooo!";
    }

    //RequestBody es que va dentro de la propia petición HTTP:
    @PostMapping("/article")
    public Article addArticle(@RequestBody Article article) {
        return articleService.addArticle(article);
    }

    @GetMapping("/article/{id}")
    public Article findArticleById(@PathVariable Long id) {
        return articleService.getArticleById(id);
    }

    @PutMapping("/article/{id}")
    public Article updateArticle(@PathVariable Long id, @RequestBody Article article) {
        return articleService.updateArticle(id, article);
    }

    @DeleteMapping("/article/{id}")
    public void deleteArticleById(@PathVariable Long id){
        articleService.deleteArticle(id);
    }

    @GetMapping("/article")
    public void deleteArticleByTitle(@RequestParam String title){
        articleService.deleteArticleByTitle(title);
    }

}
