package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IBankAccountBusiness;
import com.mounir.openfacture.dao.IBankAccountDao;
import com.mounir.openfacture.entities.BankAccount;

/**
 * 
 * @author Mounir
 *
 */
public class BankAccountBusinessImpl  extends ABaseBusiness<BankAccount, Long> implements IBankAccountBusiness{

	public IBankAccountDao getDao() {
		return (IBankAccountDao) dao;
	}

}
