package com.mounir.openfacture.dao.hibernate.impl;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IDocumentLineDao;


/**
 * 
 * @author Mounir
 *
 */
public class DocumentLineDaoImplTest extends ABaseDaoTest<IDocumentLineDao>{

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);
	
	@Before
	public void beforeMethode(){
		super.dao = new DocumentLineDaoImpl() ;
	}
}
