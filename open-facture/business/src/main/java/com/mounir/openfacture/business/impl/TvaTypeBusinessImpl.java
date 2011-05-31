package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.ITvaTypeBusiness;
import com.mounir.openfacture.dao.ITvaTypeDao;
import com.mounir.openfacture.entities.TvaType;

/**
 * 
 * @author Mounir
 * 
 */
public class TvaTypeBusinessImpl extends ABaseBusiness<TvaType, Long> implements
		ITvaTypeBusiness{

	public ITvaTypeDao getDao() {
		return (ITvaTypeDao) dao;
	}

}
