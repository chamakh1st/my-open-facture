package com.mounir.openfacture.entities;
// Generated 7 juin 2011 15:25:27 by Hibernate Tools 3.2.2.GA


import java.util.HashSet;
import java.util.Set;

/**
 * LegalForm generated by hbm2java
 */
public class LegalForm  implements java.io.Serializable {


     private long id;
     private String code;
     private String description;
     private Set<Company> companies = new HashSet<Company>(0);

    public LegalForm() {
    }

    public LegalForm(String code, String description, Set<Company> companies) {
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


