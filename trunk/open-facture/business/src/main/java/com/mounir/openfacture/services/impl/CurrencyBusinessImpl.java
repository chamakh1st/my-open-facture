package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.ICurrencyBusiness;
import com.mounir.openfacture.dao.ICurrencyDao;
import com.mounir.openfacture.entities.Currency;

/**
 * 
 * @author Mounir
 * 
 */
public class CurrencyBusinessImpl extends ABaseBusiness<Currency, Long> implements
		ICurrencyBusiness{

	public ICurrencyDao getDao() {
		return (ICurrencyDao) dao;
	}

}
