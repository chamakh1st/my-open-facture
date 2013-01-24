package com.mounir.myfacture.business.impl;

import com.mounir.myfacture.business.IEncaissementBusiness;
import com.mounir.myfacture.business.base.ABaseBusiness;
import com.mounir.myfacture.dao.IEncaissementDao;
import com.mounir.myfacture.entities.Encaissement;

/**
 * 
 * @author Mounir
 * 
 */
public class EncaissementBusinessImpl extends ABaseBusiness<Encaissement, Long> implements IEncaissementBusiness {

	public IEncaissementDao getDao() {
		return (IEncaissementDao) dao;
	}
}
