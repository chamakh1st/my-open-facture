package com.mounir.openfacture.dao.hibernate.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IBaseDao;
import com.mounir.openfacture.dao.hibernate.util.HibernateUtils;

/**
 * 
 * @author Mounir
 * 
 */
public abstract class ABaseDao<T extends Serializable, PK extends Serializable>
		implements IBaseDao<T, PK> {

	private static Logger log = LoggerFactory.getLogger(ABaseDao.class);

	public void create(T entity) {
		log.info("create(T entity)");
		getSession().save(entity)  ;
	}

	public T get(PK id) {
		log.info("T get(PK id)");
		Session session = getSession();
		session.beginTransaction() ;
//		return null ;
		return (T)session.get(getEntityClass(), id);
	}

	public void update(T entity) {
		log.info("update(T entity)");
	}

	public void delete(PK id) {
		log.info("delete(PK id)");
	}

	public List<T> list() {
		log.info("list()");
		return null;
	}
	
	@SuppressWarnings("unchecked")
	protected Class<T> getEntityClass(){
		return (Class<T>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0] ;
	}
	protected Session getSession(){
		return HibernateUtils.get().getSession() ;
	}
}
