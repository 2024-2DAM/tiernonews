package es.seteruiz.tiernonews.services;

import es.seteruiz.tiernonews.models.Article;
import es.seteruiz.tiernonews.repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(Long id) {
        //findById(id) devuelve un Optional, que es un contendero en el que puede haber o no haber un objeto
        return articleRepository.findById(id).orElse(null);
        //La línea de arriba equivale a este código de abajo:
        /*Optional<Article> article = articleRepository.findById(id);
        if (article.isPresent()) {
            return article.get();
        } else {
            return null;
        }*/
    }
}
