package com.bizruntime.task7;

import org.apache.camel.Exchange;

public class MethodInvoke {
	
	public String getData = "krishna";
	
	public String getData() {
		
		System.out.println("data is getting");
		return "empid";
	}
}	
