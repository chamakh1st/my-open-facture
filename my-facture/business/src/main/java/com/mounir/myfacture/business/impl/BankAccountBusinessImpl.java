package com.mounir.myfacture.business.impl;

import com.mounir.myfacture.business.IBankAccountBusiness;
import com.mounir.myfacture.business.base.ABaseBusiness;
import com.mounir.myfacture.dao.IBankAccountDao;
import com.mounir.myfacture.entities.BankAccount;

/**
 * 
 * @author Mounir
 * 
 */
public class BankAccountBusinessImpl extends ABaseBusiness<BankAccount, Long> implements
    IBankAccountBusiness {

	public IBankAccountDao getDao() {
		return (IBankAccountDao) dao;
	}

}
