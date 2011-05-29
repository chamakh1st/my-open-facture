package com.mounir.openfacture.services.impl;

import java.io.Serializable;
import java.util.List;

import com.mounir.openfacture.dao.IBaseDao;
import com.mounir.openfacture.services.IBaseService;

/**
 * 
 * @author Mounir
 *
 */
public abstract class ABaseService<E extends Serializable,PK extends Serializable> implements IBaseService<E, PK>{
	
	protected IBaseDao<E, PK> dao ;

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
