package com.mounir.openfacture.dao.hibernate.impl;

import java.io.Serializable;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.openfacture.dao.IBaseDAO;

/**
 * 
 * @author Mounir
 * 
 */
public abstract class ABaseDao<T extends Serializable, PK extends Serializable>
		implements IBaseDAO<T, PK> {

	private static Logger log = LoggerFactory.getLogger(ABaseDao.class);

	public void create(T entity) {
		log.info("create(T entity)");
	}

	public T get(PK id) {
		log.info("T get(PK id)");
		return null;
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
}
