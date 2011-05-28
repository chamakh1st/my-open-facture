package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.IBankAccountDao;
import com.mounir.openfacture.entities.BankAccount;
import com.mounir.openfacture.services.IBankAccountService;

/**
 * 
 * @author Mounir
 *
 */
public class BankAccountServiceImpl  extends ABaseService<BankAccount, Long> implements IBankAccountService{

	public IBankAccountDao getDao() {
		return (IBankAccountDao) dao;
	}

}
