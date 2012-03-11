package com.mounir.openfacture.dao.hibernate.impl;

import com.mounir.openfacture.dao.IAdressDao;
import com.mounir.openfacture.entities.Adress;

/**
 * 
 * @author Mounir
 *
 */
public class AdressDaoImpl extends ABaseDao<Adress, Long> implements IAdressDao{

	
	
	public static void main(String[] arg ){
		AdressDaoImpl dao = new AdressDaoImpl() ;
//		Class<Adress>  c =(Class<Adress>)((ParameterizedType)dao.getClass().getGenericSuperclass()).getActualTypeArguments()[0] ;
		Adress a = dao.get(1l)  ;
		System.out.println(a) ;
	}
}
