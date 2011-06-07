package com.mounir.openfacture.dao.hibernate.impl;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IBankAccountDao;


/**
 * 
 * @author Mounir
 *
 */
public class BankAccountDaoImplTest extends ABaseDaoTest<IBankAccountDao>{

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new BankAccountDaoImpl() ;
	}
}
