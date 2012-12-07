package com.mounir.myfacture.web.admin.bean;

import java.util.List;

import com.mounir.myfacture.entities.TvaType;

/**
 * 
 * @author Mounir
 * 
 */
public class TvaTypeBean {

	private TvaType tvaType;
	private List<TvaType> list;

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

}
