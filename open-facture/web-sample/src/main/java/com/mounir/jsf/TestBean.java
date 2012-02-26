package com.mounir.jsf;

import java.util.ArrayList;
import java.util.List;

public class TestBean {

	private List<Long> testList ;
	private String prenom ; 
	private String nom ; 

	public TestBean(){
		testList = new ArrayList<Long>() ;
		long l = 1l ;
		testList.add(l++) ;
		testList.add(l++) ;
		testList.add(l++) ;
		testList.add(l++) ;
		testList.add(l++) ;
		testList.add(l++) ;
		testList.add(l++) ;
//		testList.add(new TestBean()) ;
//		testList.add(new TestBean()) ;
	}
	public List<Long> getTestList() {
		return testList;
	}
	public void setTestList(List<Long> testList) {
		this.testList = testList;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
