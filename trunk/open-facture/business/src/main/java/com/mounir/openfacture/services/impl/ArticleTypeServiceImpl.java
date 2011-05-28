package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.IArticleTypeDao;
import com.mounir.openfacture.entities.ArticleType;
import com.mounir.openfacture.services.IArticleTypeService;

/**
 * 
 * @author Mounir
 *
 */
public class ArticleTypeServiceImpl  extends ABaseService<ArticleType, Long> implements IArticleTypeService{

	public IArticleTypeDao getDao() {
		return (IArticleTypeDao) dao;
	}

}
