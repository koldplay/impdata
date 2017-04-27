package com.bizruntime.restservice;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RestCaller {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new  ClassPathXmlApplicationContext("META-INF/spring/Camel-rest.xml");
		CamelContext camelContext = new SpringCamelContext(context);
		
		camelContext.start();
//		System.out.println("suspends");
//		camelContext.suspend();
		Thread.sleep(2000);		
//		System.out.println("resumes");
//		camelContext.resume();
		camelContext.stop();
	}
}
