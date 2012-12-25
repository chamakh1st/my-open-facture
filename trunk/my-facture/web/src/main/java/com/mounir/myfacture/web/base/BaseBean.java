package com.mounir.myfacture.web.base;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

/**
 * 
 * @author mzaghab
 *
 */
public class BaseBean {

	protected static final String FAILURE = "failure" ;

	protected static final String SUCCESS = "success" ;
	
	/**
	 * return the current FacesContext
	 * @return
	 */
	public FacesContext getFacesContext(){
		return FacesContext.getCurrentInstance() ;
	}

	/**
	 * return the current Application
	 * @return
	 */
	public Application getApplication(){
		return getFacesContext().getApplication() ;
	}
}
