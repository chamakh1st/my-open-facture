package com.mounir.openfacture.dao.hibernate.impl;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.ICountryDao;


/**
 * 
 * @author Mounir
 *
 */
public class CountryDaoImplTest extends ABaseDaoTest<ICountryDao>{

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new CountryDaoImpl() ;
	}
	@Test
	public void test(){
		
	}
}
