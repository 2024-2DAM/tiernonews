package es.seteruiz.tiernonews.controllers;

import es.seteruiz.tiernonews.models.Article;
import es.seteruiz.tiernonews.services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity deleteArticleById(@PathVariable Long id) {
        if (articleService.existsById(id)) {
            articleService.deleteArticle(id);
            return ResponseEntity.ok("Deleted");
        } else {
            return ResponseEntity.status(400).body("No article found");
        }
    }

    //localhost:8080/article?title=tituloAEliminar
    @DeleteMapping("/article")
    public ResponseEntity deleteArticleByTitle(@RequestParam String title) {
        int n = articleService.deleteArticleByTitle(title);
        if (n > 0) {
            //Retorno una respuesta http 200
            return ResponseEntity.ok("Deleted " + n);
        } else {
            //Retorno una respuesta http 400
            return ResponseEntity.status(400).body("No articles found");
        }
    }


}
