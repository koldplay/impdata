package com.test.CAMELPROJECTTASK7A;

import org.apache.camel.Exchange;

public class MethodInvoke {
	
	public String getData = "krishna";
	
	public String getData(Exchange exchange) {
		
		System.out.println("data is getting");
		System.out.println(exchange.getIn().getBody());
		return "empid";
	}
}	
