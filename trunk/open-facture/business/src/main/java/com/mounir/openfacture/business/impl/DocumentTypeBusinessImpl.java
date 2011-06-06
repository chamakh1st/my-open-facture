package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IDocumentTypeBusiness;
import com.mounir.openfacture.dao.IDocumentTypeDao;
import com.mounir.openfacture.entities.DocumentType;

/**
 * 
 * @author Mounir
 * 
 */
public class DocumentTypeBusinessImpl extends ABaseBusiness<DocumentType, Long> implements
		IDocumentTypeBusiness{
	
	public IDocumentTypeDao getDao() {
		return (IDocumentTypeDao) dao;
	}

}
