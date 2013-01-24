package com.mounir.myfacture.web;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.mounir.myfacture.business.IEncaissementBusiness;
import com.mounir.myfacture.entities.BankAccount;
import com.mounir.myfacture.entities.Encaissement;
import com.mounir.myfacture.web.base.BaseBean;

/**
 * 
 * @author Mounir
 * 
 */
public class EncaissementBean extends BaseBean {

	// Business services
	private IEncaissementBusiness encaissementBusiness;

	private long id;
	private BankAccount bankAccount;
	private Date dtEncaissement;
	private BigDecimal montant;
	private String comment;

	public IEncaissementBusiness getEncaissementBusiness() {
		return encaissementBusiness;
	}

	public void setEncaissementBusiness(IEncaissementBusiness encaissementBusiness) {
		this.encaissementBusiness = encaissementBusiness;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public Date getDtEncaissement() {
		return dtEncaissement;
	}

	public void setDtEncaissement(Date dtEncaissement) {
		this.dtEncaissement = dtEncaissement;
	}

	public BigDecimal getMontant() {
		return montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String create() {
		Encaissement encaissement = new Encaissement(id, bankAccount, dtEncaissement, montant, comment) ;
		encaissementBusiness.create(encaissement);
		return SUCCESS;
	}

	public List<Encaissement> getList() {
		return encaissementBusiness.list();
	}

}
