package com.mounir.openfacture.dao.hibernate.impl;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IDocumentDao;


/**
 * 
 * @author Mounir
 *
 */
public class DocumentDaoImplTest extends ABaseDaoTest<IDocumentDao>{

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new DocumentDaoImpl() ;
	}
	@Test
	public void test(){
		
	}
}