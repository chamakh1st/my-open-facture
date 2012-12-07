package com.mounir.myfacture;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.mounir.myfacture.WSInterface")
public class WSInterfaceImpl implements WSInterface {

	@WebMethod
	public String testWSMerthod() {
		return "Hello test methode";
	}
}
 