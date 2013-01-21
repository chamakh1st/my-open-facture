package com.mounir.myfacture.web;

import java.util.List;

import com.mounir.myfacture.entities.BankAccount;
import com.mounir.myfacture.web.base.BaseBean;

/**
 * 
 * @author Mounir
 * 
 */
public class EncaissementBean extends BaseBean {

	// Business services
//	private IBankAccountBusiness bankAccountBusiness;

	private long id;

	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String create() {
//		BankAccount bankAccount = new BankAccount(0, getUserBean().getCompany(), name, bankName, bankCode, bankWindow, accountNumber, accountKey, agencyName, adress, zipcode, city, country, iban, bic) ;
//		bankAccountBusiness.create(bankAccount);
		return SUCCESS;
	}

	public List<BankAccount> getList() {
		return null ;//bankAccountBusiness.list();
	}

}
