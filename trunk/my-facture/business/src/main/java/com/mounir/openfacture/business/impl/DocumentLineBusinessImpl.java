package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IDocumentLineBusiness;
import com.mounir.openfacture.dao.IDocumentLineDao;
import com.mounir.openfacture.entities.DocumentLine;

/**
 * 
 * @author Mounir
 * 
 */
public class DocumentLineBusinessImpl extends ABaseBusiness<DocumentLine, Long>
		implements IDocumentLineBusiness{

	public IDocumentLineDao getDao() {
		return (IDocumentLineDao) dao;
	}

}
