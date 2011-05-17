package com.mounir.openfacture.entities;

// Generated 15 mai 2011 17:36:47 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Currency generated by hbm2java
 */
public class Currency implements java.io.Serializable {

	private long id;
	private String code;
	private String description;
	private Set factures = new HashSet(0);

	public Currency() {
	}

	public Currency(long id) {
		this.id = id;
	}

	public Currency(long id, String code, String description, Set factures) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.factures = factures;
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

	public Set getFactures() {
		return this.factures;
	}

	public void setFactures(Set factures) {
		this.factures = factures;
	}

}