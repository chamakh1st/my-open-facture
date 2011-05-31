package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IUserBusiness;
import com.mounir.openfacture.dao.IUserDao;
import com.mounir.openfacture.entities.User;

/**
 * 
 * @author Mounir
 * 
 */
public class UserBusinessImpl extends ABaseBusiness<User, Long> implements
		IUserBusiness{
	
	public IUserDao getDao() {
		return (IUserDao) dao;
	}

}
