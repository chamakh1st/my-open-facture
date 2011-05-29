package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.ICompanyDao;
import com.mounir.openfacture.entities.Company;
import com.mounir.openfacture.services.ICompanyService;

/**
 * 
 * @author Mounir
 *
 */
public class CompanyServiceImpl  extends ABaseService<Company, Long> implements ICompanyService{

	public ICompanyDao getDao() {
		return (ICompanyDao) dao;
	}

}
