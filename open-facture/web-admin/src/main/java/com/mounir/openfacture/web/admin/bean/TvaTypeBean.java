package com.mounir.openfacture.web.admin.bean;

import java.math.BigDecimal;
import java.util.List;

import com.mounir.openfacture.entities.TvaType;

/**
 * 
 * @author Mounir
 *
 */
public class TvaTypeBean {

	private TvaType tvaType  ;
	private List<TvaType> list ;
	
	public long getId() {
		return tvaType.getId();
	}

	public void setId(long id) {
		tvaType.setId(id);
	}

	public String getCode() {
		return tvaType.getCode();
	}

	public void setCode(String code) {
		tvaType.setCode(code);
	}

	public List<TvaType> getList() {
		return list;
	}

	public BigDecimal getPercentage() {
		return tvaType.getPercentage();
	}

	public void setPercentage(BigDecimal percentage) {
		tvaType.setPercentage(percentage);
	}

}
