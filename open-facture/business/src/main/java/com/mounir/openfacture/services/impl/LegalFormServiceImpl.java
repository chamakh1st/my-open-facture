package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.ILegalFormDao;
import com.mounir.openfacture.entities.LegalForm;
import com.mounir.openfacture.services.ILegalFormService;

/**
 * 
 * @author Mounir
 * 
 */
public class LegalFormServiceImpl extends ABaseService<LegalForm, Long>
		implements ILegalFormService {
	
	
	public ILegalFormDao getDao() {
		return (ILegalFormDao) dao;
	}

}
