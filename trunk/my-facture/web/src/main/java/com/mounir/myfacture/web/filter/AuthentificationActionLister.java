package com.mounir.myfacture.web.filter;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;

import org.apache.myfaces.application.ActionListenerImpl;

import com.mounir.myfacture.web.UserBean;

public class AuthentificationActionLister extends ActionListenerImpl{
	
	private static final String LOGIN_PAGE = "/login.xhtml" ;
	private static final String INDEX_PAGE = "/index.xhtml" ;
	private static final String LOGIN_ACTION = "login" ;
	private static final String USER_BEAN = "userBean" ;
	

	public void processAction(ActionEvent actionEvent)
	    throws AbortProcessingException {
		FacesContext context = FacesContext.getCurrentInstance() ;
		UserBean userBean = (UserBean)context.getExternalContext().getSessionMap().get(USER_BEAN) ;
		String viewId = context.getViewRoot().getViewId() ;
		if((userBean == null || !userBean.isAuthenticated()) 
				&& !LOGIN_PAGE.equals(viewId) && !INDEX_PAGE.equals(viewId)){
			System.out.println(" Sessiontimeout ") ;
			context.getApplication().getNavigationHandler().handleNavigation(context, null, LOGIN_ACTION) ;
			return ;
//			facesContext.setViewRoot(root)
		}
		super.processAction(actionEvent) ;
	}

}
