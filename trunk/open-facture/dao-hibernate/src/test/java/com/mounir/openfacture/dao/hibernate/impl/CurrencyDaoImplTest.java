package com.mounir.openfacture.dao.hibernate.impl;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.ICurrencyDao;


/**
 * 
 * @author Mounir
 *
 */
public class CurrencyDaoImplTest extends ABaseDaoTest<ICurrencyDao>{

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new CurrencyDaoImpl() ;
	}

}
