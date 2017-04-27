package com.bizruntime.file.CamelProjectFile;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBody {

	public static void main(String[] args)throws Exception  {
		ApplicationContext  context = new ClassPathXmlApplicationContext("META-INF/spring/Camel-getbody.xml");
		CamelContext camelContext = new SpringCamelContext(context);
		camelContext.start();
		Thread.sleep(10000);
		camelContext.stop();
	}
}
