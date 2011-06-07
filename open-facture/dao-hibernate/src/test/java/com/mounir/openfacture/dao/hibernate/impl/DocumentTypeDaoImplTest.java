package com.mounir.openfacture.dao.hibernate.impl;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IDocumentTypeDao;


/**
 * 
 * @author Mounir
 *
 */
public class DocumentTypeDaoImplTest extends ABaseDaoTest<IDocumentTypeDao>{

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new DocumentTypeDaoImpl() ;
	}

}
