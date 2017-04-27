package com.bizruntime.camelprojecttask3;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/camel-properties.xml");
		CamelContext camelContext = new SpringCamelContext(context);
		
		camelContext.start();
		Thread.sleep(2000);
		camelContext.stop();
	}
}
