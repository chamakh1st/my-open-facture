package com.mounir.myfacture.web ;

import javax.xml.ws.Endpoint;


public class TestClass {

	
	public static void main(String[] arg){
		Endpoint.publish("http://localhost:8080/ws", new WSInterfaceImpl()) ;
	}
}
