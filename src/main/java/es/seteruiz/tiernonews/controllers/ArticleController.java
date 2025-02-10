package es.seteruiz.tiernonews.controllers;

import es.seteruiz.tiernonews.models.Article;
import es.seteruiz.tiernonews.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        return "Hola mundo!";
    }

    //RequestBody es que va dentro de la propia petición HTTP:
    @PostMapping("/article")
    public Article addArticle(@RequestBody Article article) {
        return articleService.addArticle(article);
    }

}
