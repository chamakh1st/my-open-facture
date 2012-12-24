package com.mounir.myfacture.entities;

// Generated 7 d�c. 2012 11:57:47 by Hibernate Tools 4.0.0

/**
 * PaymentType generated by hbm2java
 */
public class PaymentType implements java.io.Serializable {

	private long id;
	private String code;
	private String description;

	public PaymentType() {
	}

	public PaymentType(long id) {
		this.id = id;
	}

	public PaymentType(long id, String code, String description) {
		this.id = id;
		this.code = code;
		this.description = description;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}