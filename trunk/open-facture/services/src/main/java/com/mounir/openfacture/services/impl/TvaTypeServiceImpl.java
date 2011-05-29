package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.ITvaTypeDao;
import com.mounir.openfacture.entities.TvaType;
import com.mounir.openfacture.services.ITvaTypeService;

/**
 * 
 * @author Mounir
 * 
 */
public class TvaTypeServiceImpl extends ABaseService<TvaType, Long> implements
		ITvaTypeService {

	public ITvaTypeDao getDao() {
		return (ITvaTypeDao) dao;
	}

}
