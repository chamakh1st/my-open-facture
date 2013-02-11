package com.mounir.myfacture.entities;

// Generated 30 janv. 2013 22:14:09 by Hibernate Tools 4.0.0

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private long id;
	private Company company;
	private String code;
	private String name;
	private String description;
	private Long price;

	public Product() {
	}

	public Product(long id) {
		this.id = id;
	}

	public Product(long id, Company company, String code, String name,
	    String description, Long price) {
		this.id = id;
		this.company = company;
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {
		return this.price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

}