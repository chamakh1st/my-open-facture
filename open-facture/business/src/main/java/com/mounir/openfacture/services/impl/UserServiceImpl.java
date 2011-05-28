package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.IUserDao;
import com.mounir.openfacture.entities.User;
import com.mounir.openfacture.services.IUserService;

/**
 * 
 * @author Mounir
 * 
 */
public class UserServiceImpl extends ABaseService<User, Long> implements
		IUserService {
	
	public IUserDao getDao() {
		return (IUserDao) dao;
	}

}
