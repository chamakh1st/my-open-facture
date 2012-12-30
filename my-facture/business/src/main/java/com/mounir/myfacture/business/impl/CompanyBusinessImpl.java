package com.mounir.myfacture.business.impl;

import com.mounir.myfacture.business.ICompanyBusiness;
import com.mounir.myfacture.business.base.ABaseBusiness;
import com.mounir.myfacture.dao.ICompanyDao;
import com.mounir.myfacture.entities.Company;

/**
 * 
 * @author Mounir
 * 
 */
public class CompanyBusinessImpl extends ABaseBusiness<Company, Long> implements
    ICompanyBusiness {

	public ICompanyDao getDao() {
		return (ICompanyDao) dao;
	}

}
