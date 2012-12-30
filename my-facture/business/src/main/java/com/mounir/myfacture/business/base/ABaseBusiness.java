package com.mounir.myfacture.business.base;

import java.io.Serializable;
import java.util.List;

import com.mounir.myfacture.dao.base.IBaseDao;

/**
 * 
 * @author Mounir
 *
 */
public abstract class ABaseBusiness<E extends Serializable,PK extends Serializable> implements IBaseBusiness<E, PK>{
	
	protected IBaseDao<E, PK> dao ;


	public void setDao(IBaseDao<E, PK> dao) {
		this.dao = dao ;
	}
	
	public E create(E entity) {
		return dao.create(entity) ;
	}

	public E get(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	public E update(E entity) {
		return dao.update(entity) ;		
	}

	public void delete(PK id) {
		// TODO Auto-generated method stub
		
	}

	public List<E> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
