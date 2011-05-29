package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IFactureLineBusiness;
import com.mounir.openfacture.dao.IFactureLineDao;
import com.mounir.openfacture.entities.FactureLine;

/**
 * 
 * @author Mounir
 * 
 */
public class FactureLineBusinessImpl extends ABaseBusiness<FactureLine, Long>
		implements IFactureLineBusiness{

	public IFactureLineDao getDao() {
		return (IFactureLineDao) dao;
	}

}
