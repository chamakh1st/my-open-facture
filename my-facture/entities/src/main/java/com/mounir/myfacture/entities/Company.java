package com.mounir.myfacture.entities;

// Generated 7 d�c. 2012 11:57:47 by Hibernate Tools 4.0.0

/**
 * Company generated by hbm2java
 */
public class Company implements java.io.Serializable {

	private long id;
	private User user;
	private String name;
	private String siret;
	private String nafApe;
	private Long tvaCode;
	private Long capital;
	private String url;
	private String tel;
	private String fax;
	private String mail;
	private byte[] logo;

	public Company() {
	}

	public Company(long id) {
		this.id = id;
	}

	public Company(long id, User user, String name, String siret,
			String nafApe, Long tvaCode, Long capital, String url, String tel,
			String fax, String mail, byte[] logo) {
		this.id = id;
		this.user = user;
		this.name = name;
		this.siret = siret;
		this.nafApe = nafApe;
		this.tvaCode = tvaCode;
		this.capital = capital;
		this.url = url;
		this.tel = tel;
		this.fax = fax;
		this.mail = mail;
		this.logo = logo;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSiret() {
		return this.siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getNafApe() {
		return this.nafApe;
	}

	public void setNafApe(String nafApe) {
		this.nafApe = nafApe;
	}

	public Long getTvaCode() {
		return this.tvaCode;
	}

	public void setTvaCode(Long tvaCode) {
		this.tvaCode = tvaCode;
	}

	public Long getCapital() {
		return this.capital;
	}

	public void setCapital(Long capital) {
		this.capital = capital;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public byte[] getLogo() {
		return this.logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

}