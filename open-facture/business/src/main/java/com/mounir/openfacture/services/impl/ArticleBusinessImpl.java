package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IArticleBusiness;
import com.mounir.openfacture.dao.IArticleDao;
import com.mounir.openfacture.entities.Article;

/**
 * 
 * @author Mounir
 *
 */
public class ArticleBusinessImpl extends ABaseBusiness<Article, Long> implements IArticleBusiness{

	
	public IArticleDao getDao() {
		return (IArticleDao) dao;
	}

}
