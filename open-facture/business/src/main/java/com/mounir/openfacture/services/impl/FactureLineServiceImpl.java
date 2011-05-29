package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.IFactureLineDao;
import com.mounir.openfacture.entities.FactureLine;
import com.mounir.openfacture.services.IFactureLineService;

/**
 * 
 * @author Mounir
 * 
 */
public class FactureLineServiceImpl extends ABaseService<FactureLine, Long>
		implements IFactureLineService {

	public IFactureLineDao getDao() {
		return (IFactureLineDao) dao;
	}

}
