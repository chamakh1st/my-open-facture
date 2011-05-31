package com.mounir.openfacture.entities;

// Generated 21 mai 2011 12:07:35 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * CompanyType generated by hbm2java
 */
public class CompanyType implements java.io.Serializable {

	private long id;
	private String code;
	private String description;
	private Set<Company> companies = new HashSet<Company>(0);

	public CompanyType() {
	}

	public CompanyType(long id) {
		this.id = id;
	}

	public CompanyType(long id, String code, String description,
			Set<Company> companies) {
		this.id = id;
		this.code = code;
		this.description = description;
		this.companies = companies;
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

	public Set<Company> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

}