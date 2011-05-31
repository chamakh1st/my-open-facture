package com.mounir.openfacture.business.impl;

import com.mounir.openfacture.business.IAdressBusiness;
import com.mounir.openfacture.dao.IAdressDao;
import com.mounir.openfacture.dao.IBaseDao;
import com.mounir.openfacture.entities.Adress;

/**
 * 
 * @author Mounir
 *
 */
public class AdressBusinessImpl extends ABaseBusiness<Adress, Long> implements IAdressBusiness{
	
	
	public IAdressDao getDao() {
		return (IAdressDao) dao;
	}

}
