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

}
