package com.mounir.openfacture.entities;
// Generated 7 juin 2011 15:25:27 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Company generated by hbm2java
 */
public class Company  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 5498982521069525926L;
	
	private long id;
     private User user;
     private Company company;
     private CompanyType companyType;
     private Adress adress;
     private LegalForm legalForm;
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
     private Set<Document> documents = new HashSet<Document>(0);
     private Set<Company> companies = new HashSet<Company>(0);
     private Set<Company> companies_1 = new HashSet<Company>(0);

    public Company() {
    }

    public Company(User user, Company company, CompanyType companyType, Adress adress, LegalForm legalForm, String name, String siret, String nafApe, Long tvaCode, Long capital, String url, String tel, String fax, String mail, byte[] logo, Set<Document> documents, Set<Company> companies, Set<Company> companies_1) {
       this.user = user;
       this.company = company;
       this.companyType = companyType;
       this.adress = adress;
       this.legalForm = legalForm;
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
       this.documents = documents;
       this.companies = companies;
       this.companies_1 = companies_1;
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
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    public CompanyType getCompanyType() {
        return this.companyType;
    }
    
    public void setCompanyType(CompanyType companyType) {
        this.companyType = companyType;
    }
    public Adress getAdress() {
        return this.adress;
    }
    
    public void setAdress(Adress adress) {
        this.adress = adress;
    }
    public LegalForm getLegalForm() {
        return this.legalForm;
    }
    
    public void setLegalForm(LegalForm legalForm) {
        this.legalForm = legalForm;
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
    public Set<Document> getDocuments() {
        return this.documents;
    }
    
    public void setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    public Set<Company> getCompanies() {
        return this.companies;
    }
    
    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }
    public Set<Company> getCompanies_1() {
        return this.companies_1;
    }
    
    public void setCompanies_1(Set<Company> companies_1) {
        this.companies_1 = companies_1;
    }




}


