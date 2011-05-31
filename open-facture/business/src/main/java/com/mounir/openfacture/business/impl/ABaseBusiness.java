package com.mounir.openfacture.business.impl;

import java.io.Serializable;
import java.util.List;

import com.mounir.openfacture.business.IBaseBusiness;
import com.mounir.openfacture.dao.IBaseDao;

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
	
	public void create(E entity) {
		// TODO Auto-generated method stub
		
	}

	public E get(PK id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(E entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(PK id) {
		// TODO Auto-generated method stub
		
	}

	public List<E> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
