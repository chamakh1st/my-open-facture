package com.mounir.myfacture.web;

import com.mounir.myfacture.business.IBankAccountBusiness;
import com.mounir.myfacture.entities.BankAccount;
import com.mounir.myfacture.web.base.BaseBean;

/**
 * 
 * @author Mounir
 * 
 */
public class BankAccountBean extends BaseBean {

	// Business services
	private IBankAccountBusiness bankAccountBusiness;

	private long id;
//	private Company company;
	private String name;
	private String bankName;
	private String bankCode;
	private String bankWindow;
	private String accountNumber;
	private String accountKey;
	private String agencyName;
	private String adress;
	private String zipcode;
	private String city;
	private String country;
	private String iban;
	private String bic;


	public IBankAccountBusiness getBankAccountBusiness() {
		return bankAccountBusiness;
	}

	public void setBankAccountBusiness(IBankAccountBusiness bankAccountBusiness) {
		this.bankAccountBusiness = bankAccountBusiness;
	}

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

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankWindow() {
		return bankWindow;
	}

	public void setBankWindow(String bankWindow) {
		this.bankWindow = bankWindow;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountKey() {
		return accountKey;
	}

	public void setAccountKey(String accountKey) {
		this.accountKey = accountKey;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String create() {
		BankAccount bankAccount = new BankAccount(0, getUserBean().getCompany(), name, bankName, bankCode, bankWindow, accountNumber, accountKey, agencyName, adress, zipcode, city, country, iban, bic) ;
		bankAccountBusiness.create(bankAccount);
		return SUCCESS;
	}

	public String saveCompany() {
//		companyBusiness.update(company);
		return null;
	}

}
