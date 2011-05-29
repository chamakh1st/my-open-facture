package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.ICompanyTypeBusiness;
import com.mounir.openfacture.dao.ICompanyTypeDao;
import com.mounir.openfacture.entities.CompanyType;

/**
 * 
 * @author Mounir
 *
 */
public class CompanyTypeBusinessImpl  extends ABaseBusiness<CompanyType, Long> implements ICompanyTypeBusiness{
	
	
	public ICompanyTypeDao getDao() {
		return (ICompanyTypeDao) dao;
	}

}
