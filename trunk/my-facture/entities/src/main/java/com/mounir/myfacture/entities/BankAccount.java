package com.mounir.myfacture.entities;

// Generated 22 janv. 2013 22:17:16 by Hibernate Tools 4.0.0

/**
 * BankAccount generated by hbm2java
 */
public class BankAccount implements java.io.Serializable {

	private long id;
	private Company company;
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

	public BankAccount() {
	}

	public BankAccount(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public BankAccount(long id, Company company, String name, String bankName,
	    String bankCode, String bankWindow, String accountNumber,
	    String accountKey, String agencyName, String adress, String zipcode,
	    String city, String country, String iban, String bic) {
		this.id = id;
		this.company = company;
		this.name = name;
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.bankWindow = bankWindow;
		this.accountNumber = accountNumber;
		this.accountKey = accountKey;
		this.agencyName = agencyName;
		this.adress = adress;
		this.zipcode = zipcode;
		this.city = city;
		this.country = country;
		this.iban = iban;
		this.bic = bic;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankWindow() {
		return this.bankWindow;
	}

	public void setBankWindow(String bankWindow) {
		this.bankWindow = bankWindow;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountKey() {
		return this.accountKey;
	}

	public void setAccountKey(String accountKey) {
		this.accountKey = accountKey;
	}

	public String getAgencyName() {
		return this.agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIban() {
		return this.iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return this.bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

}