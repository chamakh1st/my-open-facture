package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.ICountryBusiness;
import com.mounir.openfacture.dao.ICountryDao;
import com.mounir.openfacture.entities.Country;

/**
 * 
 * @author Mounir
 *
 */
public class CountryBusinessImpl  extends ABaseBusiness<Country, Long> implements ICountryBusiness{
	
	public ICountryDao getDao() {
		return (ICountryDao) dao;
	}

}
