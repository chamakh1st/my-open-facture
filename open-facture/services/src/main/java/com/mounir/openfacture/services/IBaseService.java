package com.mounir.openfacture.services;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Mounir
 *
 */
public interface IBaseService<T extends Serializable, PK extends Serializable> {

	void create(T entity) ;
	T get(PK id) ;
	void update(T entity) ;
	void delete(PK id) ;
	List<T> list() ;
}
