package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IFactureBusiness;
import com.mounir.openfacture.dao.IFactureDao;
import com.mounir.openfacture.entities.Facture;

/**
 * 
 * @author Mounir
 * 
 */
public class FactureBusinessImpl extends ABaseBusiness<Facture, Long> implements
		IFactureBusiness{
	
	public IFactureDao getDao() {
		return (IFactureDao) dao;
	}

}
