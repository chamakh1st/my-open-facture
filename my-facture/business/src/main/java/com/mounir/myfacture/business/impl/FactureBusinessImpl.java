package com.mounir.myfacture.business.impl;

import com.mounir.myfacture.business.IFactureBusiness;
import com.mounir.myfacture.business.base.ABaseBusiness;
import com.mounir.myfacture.dao.IFactureDao;
import com.mounir.myfacture.entities.Facture;

/**
 * 
 * @author Mounir
 * 
 */
public class FactureBusinessImpl extends ABaseBusiness<Facture, Long> implements IFactureBusiness {

	public IFactureDao getDao() {
		return (IFactureDao) dao;
	}

}
