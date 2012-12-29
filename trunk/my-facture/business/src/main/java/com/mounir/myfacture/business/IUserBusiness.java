package com.mounir.myfacture.business;

import com.mounir.myfacture.business.base.IBaseBusiness;
import com.mounir.myfacture.entities.User;

/**
 * 
 * @author Mounir
 *
 */
public interface IUserBusiness extends IBaseBusiness<User, Long> {

	public User login(String login, String password) ;
}
