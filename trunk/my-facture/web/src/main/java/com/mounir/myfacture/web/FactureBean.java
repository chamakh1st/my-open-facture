package com.mounir.myfacture.web;

import java.util.Date;
import java.util.List;

import com.mounir.myfacture.business.IFactureBusiness;
import com.mounir.myfacture.entities.Company;
import com.mounir.myfacture.entities.Facture;
import com.mounir.myfacture.web.base.BaseBean;

/**
 * 
 * @author Mounir
 * 
 */
public class FactureBean extends BaseBean {

	// Business services
	private IFactureBusiness factureBusiness;

	private long id;
	private Company clientCompany;
	private String numFacture;
	private Date dtFacture;

	public IFactureBusiness getFactureBusiness() {
		return factureBusiness;
	}

	public void setFactureBusiness(IFactureBusiness factureBusiness) {
		this.factureBusiness = factureBusiness;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Company getClientCompany() {
		return clientCompany;
	}

	public void setClientCompany(Company clientCompany) {
		this.clientCompany = clientCompany;
	}

	public String getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}

	public Date getDtFacture() {
		return dtFacture;
	}

	public void setDtFacture(Date dtFacture) {
		this.dtFacture = dtFacture;
	}

	public String create() {
		Facture facture = new Facture(0, null,  getUserBean().getCompany(), numFacture, dtFacture) ;
		factureBusiness.create(facture);
		return SUCCESS;
	}

	public List<Facture> getList() {
		return factureBusiness.list();
	}

}
