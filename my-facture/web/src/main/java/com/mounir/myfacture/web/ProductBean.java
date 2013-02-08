package com.mounir.myfacture.web;

import java.util.List;

import com.mounir.myfacture.business.IProductBusiness;
import com.mounir.myfacture.entities.Product;
import com.mounir.myfacture.web.base.BaseBean;

/**
 * 
 * @author Mounir
 * 
 */
public class ProductBean extends BaseBean {

	// Business services
	private IProductBusiness productBusiness;

	private long id;
	private String code;
	private String name;
	private String description;
	private Long price;

	public IProductBusiness getProductBusiness() {
		return productBusiness;
	}

	public void setProductBusiness(IProductBusiness productBusiness) {
		this.productBusiness = productBusiness;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String create() {
		Product product = new Product(0, getUserBean().getCompany(), code, name, description, price) ;
		productBusiness.create(product);
		return SUCCESS;
	}

	public List<Product> getList() {
		return productBusiness.list();
	}

}
