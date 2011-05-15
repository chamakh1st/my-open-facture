package com.mounir.openfacture.entities;

// Generated 15 mai 2011 17:36:47 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Facture generated by hbm2java
 */
public class Facture implements java.io.Serializable {

	private long id;
	private Currency currency;
	private Company company;
	private Set factureLines = new HashSet(0);

	public Facture() {
	}

	public Facture(long id) {
		this.id = id;
	}

	public Facture(long id, Currency currency, Company company, Set factureLines) {
		this.id = id;
		this.currency = currency;
		this.company = company;
		this.factureLines = factureLines;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Set getFactureLines() {
		return this.factureLines;
	}

	public void setFactureLines(Set factureLines) {
		this.factureLines = factureLines;
	}

}
