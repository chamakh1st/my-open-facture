package com.mounir.myfacture.web.common;

import javax.faces.application.Application;
import javax.faces.context.FacesContext;

/**
 * 
 * @author mzaghab
 *
 */
public class BaseBean {

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
