package com.mounir.openfacture.dao.hibernate.impl;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IUserDao;


/**
 * 
 * @author Mounir
 *
 */
public class UserDaoImplTest extends ABaseDaoTest<IUserDao>{

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new UserDaoImpl() ;
	}
	@Test
	public void test(){
		
	}

}
