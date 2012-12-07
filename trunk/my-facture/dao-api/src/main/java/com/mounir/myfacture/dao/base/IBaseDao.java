package com.mounir.myfacture.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Mounir
 *
 */
public interface IBaseDao<T extends Serializable, PK extends Serializable> {

	void create(T entity) ;
	T get(PK id) ;
	void update(T entity) ;
	void delete(T entity) ;
	List<T> list() ;
}
