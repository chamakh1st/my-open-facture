package com.mounir.openfacture.dao.hibernate.impl;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.ITvaTypeDao;
import com.mounir.openfacture.dao.hibernate.util.HibernateUtils;
import com.mounir.openfacture.entities.TvaType;


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
	public void createTest() {
//		Session session = HibernateUtils.get().getSession() ;
//		Transaction tx = session.beginTransaction() ;
//		log.info("createTest");
//		TvaType entity = new TvaType() ;
//		entity.setCode("code test ") ; 	
//		entity.setPercentage(BigDecimal.TEN) ;
//		dao.create(entity);
//		log.info("saved entity ["+entity+"]") ;
////		Assert.assertNotNull("Object not saved ...", entity.get) ;
//		tx.commit() ;
	}

	@Test
	public void getTest() {
		log.info("getTest");
	}

	@Test
	public void updateTest() {
		log.info("updateTest");
	}

	@Test
	public void deleteTest() {
		log.info("deleteTest");
	}

	@Test
	public void listTest() {
		log.info("listTest");
	}

}
