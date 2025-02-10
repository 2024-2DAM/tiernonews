package es.seteruiz.tiernonews.repositories;

import es.seteruiz.tiernonews.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
    void deleteByTitle(String title);
}
