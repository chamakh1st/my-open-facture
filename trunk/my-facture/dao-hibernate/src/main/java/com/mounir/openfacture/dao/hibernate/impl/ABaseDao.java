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
//		return null ;
		return (T)session.get(getEntityClass(), id);
	}

	public void update(T entity) {
		log.info("update(T entity)");
		getSession().update(entity) ;
	}

	public void delete(T entity) {
		log.info("delete(T entity)");
		getSession().delete(entity) ;
	}

	public List<T> list() {
		log.info("list()");
		return getSession().createCriteria(getEntityClass()).list();
	}
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected Class<T> getEntityClass(){
		return (Class<T>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0] ;
	}
	/**
	 * 
	 * @return
	 */
	protected Session getSession(){
		return HibernateUtils.get().getSession() ;
	}
}
