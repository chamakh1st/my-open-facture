package com.mounir.myfacture.business.impl;

import com.mounir.myfacture.business.IProductBusiness;
import com.mounir.myfacture.business.base.ABaseBusiness;
import com.mounir.myfacture.dao.IProductDao;
import com.mounir.myfacture.entities.Product;

/**
 * 
 * @author Mounir
 * 
 */
public class ProductBusinessImpl extends ABaseBusiness<Product, Long> implements IProductBusiness {

	public IProductDao getDao() {
		return (IProductDao) dao;
	}

}
