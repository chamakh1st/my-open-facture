package com.mounir.myfacture.dao.hibernate.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.mounir.myfacture.dao.IUserDao;
import com.mounir.myfacture.dao.hibernate.base.ABaseDao;
import com.mounir.myfacture.entities.User;

/**
 * 
 * @author Mounir
 *
 */
public class UserDaoImpl extends ABaseDao<User, Long>  implements IUserDao{

	public User login(String login, String password) {
		Criteria criteria = getCurrentSession().createCriteria(User.class) ;
		criteria.add(Restrictions.eq("login", login)) ;
		criteria.add(Restrictions.eq("password", password)) ;
		return (User)criteria.uniqueResult() ;
  }

}
