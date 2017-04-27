package com.bizruntime.propertiesfileread;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	private static final Logger LOGGER = Logger.getLogger(Consumer.class);
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("properyfile.xml");
		Reader reader = (Reader) context.getBean("data");
		LOGGER.info(reader.toString());
	}
}
