package com.mounir.myfacture.business.impl;

import com.mounir.myfacture.business.IUserBusiness;
import com.mounir.myfacture.business.base.ABaseBusiness;
import com.mounir.myfacture.dao.IUserDao;
import com.mounir.myfacture.entities.User;

/**
 * 
 * @author Mounir
 * 
 */
public class UserBusinessImpl extends ABaseBusiness<User, Long> implements
    IUserBusiness {

	public IUserDao getDao() {
		return (IUserDao) dao;
	}

	public User login(String login, String password) {
		return getDao().login(login, password);
	}

}
