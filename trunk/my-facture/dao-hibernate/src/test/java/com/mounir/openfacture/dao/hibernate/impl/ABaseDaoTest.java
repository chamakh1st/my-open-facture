package com.mounir.openfacture.dao.hibernate.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IBaseDao;

/**
 * 
 * @author Mounir
 * 
 */
public abstract class ABaseDaoTest<T extends IBaseDao> {

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);

	protected IBaseDao dao;


}
