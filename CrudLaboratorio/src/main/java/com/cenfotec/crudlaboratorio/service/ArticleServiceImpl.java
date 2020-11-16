package com.cenfotec.crudlaboratorio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cenfotec.crudlaboratorio.domain.Article;
import com.cenfotec.crudlaboratorio.repo.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	ArticleRepository articleRepo;
	
	
	public void save(Article article) {
		articleRepo.save(article);
	}
	
}
