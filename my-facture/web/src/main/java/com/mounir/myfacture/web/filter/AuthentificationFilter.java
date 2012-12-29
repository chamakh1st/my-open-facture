package com.mounir.myfacture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.mounir.myfacture.web.UserBean;

public class AuthentificationFilter implements Filter {
	
	private static final String USER_BEAN = "userBean" ;
	
	private static final String INDEX_PAGE = "/index.xhtml" ;

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest =((HttpServletRequest)request);
		String pathInfo = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
    		
//		if(!INDEX_PAGE.equals(pathInfo)){
			UserBean userBean =(UserBean) httpRequest.getSession().getAttribute(USER_BEAN) ;
			if( userBean == null ){
				httpRequest.getRequestDispatcher(INDEX_PAGE).forward(request, response) ;
			}
//		}
		chain.doFilter(request, response) ;
	}

	public void destroy() {

	}

}
