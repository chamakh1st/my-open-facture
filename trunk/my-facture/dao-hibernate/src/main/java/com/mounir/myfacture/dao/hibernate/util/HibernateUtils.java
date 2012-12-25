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
	
	private static HibernateUtils singleton ;

	private HibernateUtils() {
		if(sessionFactory == null){
			sessionFactory = new Configuration().configure().buildSessionFactory() ;
		}
	}
	
	public static HibernateUtils get(){
		if(singleton == null){
			synchronized(HibernateUtils.class){
				if(singleton == null){
					singleton = new HibernateUtils() ;
				}
			}
		}
		return singleton ;
	}
	public Session getCurrentSession(){
		return sessionFactory.getCurrentSession() ;
	}

}
