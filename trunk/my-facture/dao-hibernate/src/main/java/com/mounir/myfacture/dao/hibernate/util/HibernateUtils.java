package com.mounir.myfacture.dao.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Mounir
 * 
 */
public class HibernateUtils {

	private static Logger log = LoggerFactory.getLogger(HibernateUtils.class) ;
	private static SessionFactory sessionFactory;

	private HibernateUtils() {
		if(sessionFactory == null){
			sessionFactory = new Configuration().configure().buildSessionFactory() ;
		}
	}
	public static HibernateUtils get(){
		return new HibernateUtils() ;
	}
	public Session getSession(){
		return sessionFactory.getCurrentSession() ;
	}

}
