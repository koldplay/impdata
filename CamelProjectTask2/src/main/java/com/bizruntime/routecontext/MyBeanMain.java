package com.bizruntime.routecontext;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanMain {
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/route.xml");
		CamelContext camelContext = new SpringCamelContext(context);
		
		camelContext.start();
		Thread.sleep(3000);
		camelContext.stop();
		
	}
}
