package com.mounir.myfacture.dao.hibernate.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.myfacture.dao.base.IBaseDao;

/**
 * 
 * @author Mounir
 * 
 */
public abstract class ABaseDaoTest<T extends IBaseDao> {

	private static Logger log = LoggerFactory.getLogger(ABaseDaoTest.class);

	protected IBaseDao dao;


}
