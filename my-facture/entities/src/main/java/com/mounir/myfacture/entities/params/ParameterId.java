package com.mounir.myfacture.entities.params;

// Generated 22 janv. 2013 22:17:16 by Hibernate Tools 4.0.0

/**
 * ParameterId generated by hbm2java
 */
public class ParameterId implements java.io.Serializable {

	private String code;
	private String value;

	public ParameterId() {
	}

	public ParameterId(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ParameterId))
			return false;
		ParameterId castOther = (ParameterId) other;

		return ((this.getCode() == castOther.getCode()) || (this.getCode() != null
		    && castOther.getCode() != null && this.getCode().equals(
		    castOther.getCode())))
		    && ((this.getValue() == castOther.getValue()) || (this.getValue() != null
		        && castOther.getValue() != null && this.getValue().equals(
		        castOther.getValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result
		    + (getValue() == null ? 0 : this.getValue().hashCode());
		return result;
	}

}
