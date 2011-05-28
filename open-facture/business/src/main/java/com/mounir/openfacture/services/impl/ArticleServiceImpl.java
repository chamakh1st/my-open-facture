package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.IArticleDao;
import com.mounir.openfacture.entities.Article;
import com.mounir.openfacture.services.IArticleService;

/**
 * 
 * @author Mounir
 *
 */
public class ArticleServiceImpl  extends ABaseService<Article, Long> implements IArticleService{

	
	public IArticleDao getDao() {
		return (IArticleDao) dao;
	}

}
