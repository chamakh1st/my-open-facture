package com.mounir.openfacture.dao.hibernate.impl;

import org.hibernate.Session;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.ITvaTypeDao;
import com.mounir.openfacture.dao.hibernate.util.HibernateUtils;


/**
 * 
 * @author Mounir
 *
 */
public class TvaTypeDaoImplTest extends ABaseDaoTest<ITvaTypeDao>{
	
	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new TvaTypeDaoImpl() ;
	}
	
	@Test
	public void testConnection(){
		Session session = HibernateUtils.get().getSession() ;
		log.info(session.toString()) ;
	}

}


