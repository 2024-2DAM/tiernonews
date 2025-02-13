package es.seteruiz.tiernonews.repositories;

import es.seteruiz.tiernonews.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    int deleteArticleByTitle(String title);
    boolean existsArticlesByTitle(String title);
}
