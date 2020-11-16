package com.cenfotec.crudlaboratorio.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.crudlaboratorio.domain.Article;
public interface ArticleRepository extends JpaRepository<Article,Long>{

}
