package com.mounir.myfacture;

import javax.jws.WebService;

@WebService(endpointInterface="com.mounir.myfacture.WSInterface")
public class WSInterfaceImpl implements WSInterface {

	@Override
	public String testWSMerthod() {
		return "Hello test methode";
	}

}
 