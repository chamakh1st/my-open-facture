package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.ICompanyBusiness;
import com.mounir.openfacture.dao.ICompanyDao;
import com.mounir.openfacture.entities.Company;

/**
 * 
 * @author Mounir
 *
 */
public class CompanyBusinessImpl  extends ABaseBusiness<Company, Long> implements ICompanyBusiness{

	public ICompanyDao getDao() {
		return (ICompanyDao) dao;
	}

}
