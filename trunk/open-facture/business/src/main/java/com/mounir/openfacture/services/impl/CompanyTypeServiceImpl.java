package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.ICompanyTypeDao;
import com.mounir.openfacture.entities.CompanyType;
import com.mounir.openfacture.services.ICompanyTypeService;

/**
 * 
 * @author Mounir
 *
 */
public class CompanyTypeServiceImpl  extends ABaseService<CompanyType, Long> implements ICompanyTypeService{
	
	
	public ICompanyTypeDao getDao() {
		return (ICompanyTypeDao) dao;
	}

}
