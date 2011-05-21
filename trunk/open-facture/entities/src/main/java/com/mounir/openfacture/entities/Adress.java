package com.mounir.openfacture.entities;

// Generated 21 mai 2011 12:07:35 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Adress generated by hbm2java
 */
public class Adress implements java.io.Serializable {

	private long id;
	private Country country;
	private String adress1;
	private String adress2;
	private String zipcode;
	private String region;
	private Set<Company> companies = new HashSet<Company>(0);
	private Set<BankAccount> bankAccounts = new HashSet<BankAccount>(0);

	public Adress() {
	}

	public Adress(long id) {
		this.id = id;
	}

	public Adress(long id, Country country, String adress1, String adress2,
			String zipcode, String region, Set<Company> companies,
			Set<BankAccount> bankAccounts) {
		this.id = id;
		this.country = country;
		this.adress1 = adress1;
		this.adress2 = adress2;
		this.zipcode = zipcode;
		this.region = region;
		this.companies = companies;
		this.bankAccounts = bankAccounts;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getAdress1() {
		return this.adress1;
	}

	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}

	public String getAdress2() {
		return this.adress2;
	}

	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

	public Set<BankAccount> getBankAccounts() {
		return this.bankAccounts;
	}

	public void setBankAccounts(Set<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

}
