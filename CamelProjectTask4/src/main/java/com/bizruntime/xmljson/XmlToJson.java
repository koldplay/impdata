package com.bizruntime.xmljson;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlToJson {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/Camel-xmltojson.xml");
		CamelContext camelContext = new SpringCamelContext(context);
		camelContext.start();
		Thread.sleep(2000);
		camelContext.stop();		
	}
}
