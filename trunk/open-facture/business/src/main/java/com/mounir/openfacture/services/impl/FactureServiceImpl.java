package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.IFactureDao;
import com.mounir.openfacture.entities.Facture;
import com.mounir.openfacture.services.IFactureService;

/**
 * 
 * @author Mounir
 * 
 */
public class FactureServiceImpl extends ABaseService<Facture, Long> implements
		IFactureService {
	
	public IFactureDao getDao() {
		return (IFactureDao) dao;
	}

}
