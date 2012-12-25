package com.mounir.myfacture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.StaleObjectStateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mounir.myfacture.dao.hibernate.util.HibernateUtils;

public class OpenSessionInView implements Filter {

	private static Logger log = LoggerFactory.getLogger(OpenSessionInView.class);
	
	public void init(FilterConfig filterConfig) throws ServletException {
	  log.debug("Initializing filter...");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		 try {
	            HibernateUtils.get().getCurrentSession().beginTransaction();
	 
	            // Call the next filter (continue request processing)
	            chain.doFilter(request, response);
	 
	            // Commit and cleanup
	            log.debug("Committing the database transaction");
	            HibernateUtils.get().getCurrentSession().getTransaction().commit();
	 
	        } catch (StaleObjectStateException staleEx) {
	            log.error("This interceptor does not implement optimistic concurrency control!");
	            log.error("Your application will not work until you add compensation actions!");
	            // Rollback, close everything, possibly compensate for any permanent changes
	            // during the conversation, and finally restart business conversation. Maybe
	            // give the user of the application a chance to merge some of his work with
	            // fresh data... what you do here depends on your applications design.
	            throw staleEx;
	        } catch (Throwable ex) {
	            // Rollback only
	            ex.printStackTrace();
	            try {
	                if (HibernateUtils.get().getCurrentSession().getTransaction().isActive()) {
	                    log.debug("Trying to rollback database transaction after exception");
	                    HibernateUtils.get().getCurrentSession().getTransaction().rollback();
	                }
	            } catch (Throwable rbEx) {
	                log.error("Could not rollback transaction after exception!", rbEx);
	            }
	 
	            // Let others handle it... maybe another interceptor for exceptions?
	            throw new ServletException(ex);
	        }		
	}
	

	public void destroy() {

	}

}
