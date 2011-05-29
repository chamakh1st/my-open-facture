package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.ICountryDao;
import com.mounir.openfacture.entities.Country;
import com.mounir.openfacture.services.ICountryService;

/**
 * 
 * @author Mounir
 *
 */
public class CountryServiceImpl  extends ABaseService<Country, Long> implements ICountryService{
	
	public ICountryDao getDao() {
		return (ICountryDao) dao;
	}

}
