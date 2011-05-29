package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.ILegalFormBusiness;
import com.mounir.openfacture.dao.ILegalFormDao;
import com.mounir.openfacture.entities.LegalForm;

/**
 * 
 * @author Mounir
 * 
 */
public class LegalFormBusinessImpl extends ABaseBusiness<LegalForm, Long>
		implements ILegalFormBusiness{
	
	
	public ILegalFormDao getDao() {
		return (ILegalFormDao) dao;
	}

}
