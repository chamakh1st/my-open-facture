package com.mounir.myfacture.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Mounir
 *
 */
public interface IBaseDao<T extends Serializable, PK extends Serializable> {

	T create(T entity) ;
	T get(PK id) ;
	T update(T entity) ;
	void delete(T entity) ;
	List<T> list() ;
}
