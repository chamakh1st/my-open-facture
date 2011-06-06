package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IDocumentBusiness;
import com.mounir.openfacture.dao.IDocumentDao;
import com.mounir.openfacture.entities.Document;

/**
 * 
 * @author Mounir
 * 
 */
public class DocumentBusinessImpl extends ABaseBusiness<Document, Long> implements
		IDocumentBusiness{
	
	public IDocumentDao getDao() {
		return (IDocumentDao) dao;
	}

}
