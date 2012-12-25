package com.mounir.myfacture.dao.hibernate.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.myfacture.dao.base.IBaseDao;
import com.mounir.myfacture.dao.hibernate.util.HibernateUtils;

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
		getCurrentSession().save(entity)  ;
	}

	public T get(PK id) {
		log.info("T get(PK id)");
		return (T)getCurrentSession().get(getEntityClass(), id);
	}

	public void update(T entity) {
		log.info("update(T entity)");
		getCurrentSession().update(entity) ;
	}

	public void delete(T entity) {
		log.info("delete(T entity)");
		getCurrentSession().delete(entity) ;
	}

	public List<T> list() {
		log.info("list()");
		return getCurrentSession().createCriteria(getEntityClass()).list();
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
	protected Session getCurrentSession(){
		return HibernateUtils.get().getCurrentSession() ;
	}
}
