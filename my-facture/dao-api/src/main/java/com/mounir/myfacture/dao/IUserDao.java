package com.mounir.myfacture.dao;

import com.mounir.myfacture.dao.base.IBaseDao;
import com.mounir.myfacture.entities.User;

/**
 * 
 * @author Mounir
 * 
 */
public interface IUserDao extends IBaseDao<User, Long> {

	User login(String login, String password);

}
