package com.mounir.myfacture.web.filter;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;

import org.apache.myfaces.application.ActionListenerImpl;

import com.mounir.myfacture.web.UserBean;

public class AuthentificationActionLister extends ActionListenerImpl{
	
//	private static final String LOGIN_PAGE = "/login.xhtml" ;
	private static final String INDEX_PAGE = "/index.xhtml" ;
//	private static final String CREATE_ACCOUNT_PAGE = "/createAccount.xhtml" ;
	private static final String LOGIN_ACTION = "login" ;
	private static final String PUBLIC_URL_PREFIX = "/public/" ;
	private static final String USER_BEAN = "userBean" ;
	

	public void processAction(ActionEvent actionEvent)
	    throws AbortProcessingException {
		FacesContext context = FacesContext.getCurrentInstance() ;
		UserBean userBean = (UserBean)context.getExternalContext().getSessionMap().get(USER_BEAN) ;
		String viewId = context.getViewRoot().getViewId() ;
		if(!viewId.equals(INDEX_PAGE) 
				&& !viewId.startsWith(PUBLIC_URL_PREFIX) 
				&& (userBean == null || !userBean.isAuthenticated())){
			System.out.println(" Sessiontimeout ") ;
			context.getApplication().getNavigationHandler().handleNavigation(context, null, LOGIN_ACTION) ;
			return ;
		}
		super.processAction(actionEvent) ;
	}

}
