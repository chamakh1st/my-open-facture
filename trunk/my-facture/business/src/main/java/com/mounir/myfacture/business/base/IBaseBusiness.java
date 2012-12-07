package com.mounir.myfacture.business.base;

import java.io.Serializable;
import java.util.List;

import com.mounir.myfacture.dao.base.IBaseDao;

/**
 * 
 * @author Mounir
 *
 */
public interface IBaseBusiness<E extends Serializable, PK extends Serializable> {

	
	IBaseDao<E, PK> getDao() ;
	void setDao(IBaseDao<E, PK> dao) ;

	void create(E entity) ;
	E get(PK id) ;
	void update(E entity) ;
	void delete(PK id) ;
	List<E> list() ;
}
