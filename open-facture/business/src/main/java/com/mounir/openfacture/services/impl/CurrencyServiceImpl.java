package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.ICurrencyDao;
import com.mounir.openfacture.entities.Currency;
import com.mounir.openfacture.services.ICurrencyService;

/**
 * 
 * @author Mounir
 * 
 */
public class CurrencyServiceImpl extends ABaseService<Currency, Long> implements
		ICurrencyService {

	public ICurrencyDao getDao() {
		return (ICurrencyDao) dao;
	}

}
