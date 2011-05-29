package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IArticleTypeBusiness;
import com.mounir.openfacture.dao.IArticleTypeDao;
import com.mounir.openfacture.entities.ArticleType;

/**
 * 
 * @author Mounir
 *
 */
public class ArticleTypeBusinessImpl  extends ABaseBusiness<ArticleType, Long> implements IArticleTypeBusiness{

	public IArticleTypeDao getDao() {
		return (IArticleTypeDao) dao;
	}

}
