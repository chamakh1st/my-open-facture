package com.mounir.openfacture.services.impl;

import com.mounir.openfacture.dao.IAdressDao;
import com.mounir.openfacture.entities.Adress;
import com.mounir.openfacture.services.IAdressService;

/**
 * 
 * @author Mounir
 *
 */
public class AdressServiceImpl extends ABaseService<Adress, Long> implements IAdressService{
	
	
	public IAdressDao getDao() {
		return (IAdressDao) dao;
	}
}
