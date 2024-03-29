package com.mounir.myfacture.entities;

// Generated 22 janv. 2013 22:17:16 by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Facture generated by hbm2java
 */
public class Facture implements java.io.Serializable {

	private long id;
	private Company companyByClientId;
	private Company companyByCompanyId;
	private String numFacture;
	private Date dtFacture;

	public Facture() {
	}

	public Facture(long id) {
		this.id = id;
	}

	public Facture(long id, Company companyByClientId,
	    Company companyByCompanyId, String numFacture, Date dtFacture) {
		this.id = id;
		this.companyByClientId = companyByClientId;
		this.companyByCompanyId = companyByCompanyId;
		this.numFacture = numFacture;
		this.dtFacture = dtFacture;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Company getCompanyByClientId() {
		return this.companyByClientId;
	}

	public void setCompanyByClientId(Company companyByClientId) {
		this.companyByClientId = companyByClientId;
	}

	public Company getCompanyByCompanyId() {
		return this.companyByCompanyId;
	}

	public void setCompanyByCompanyId(Company companyByCompanyId) {
		this.companyByCompanyId = companyByCompanyId;
	}

	public String getNumFacture() {
		return this.numFacture;
	}

	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}

	public Date getDtFacture() {
		return this.dtFacture;
	}

	public void setDtFacture(Date dtFacture) {
		this.dtFacture = dtFacture;
	}

}
