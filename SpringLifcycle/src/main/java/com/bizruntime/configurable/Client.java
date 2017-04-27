package com.bizruntime.configurable;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		
		context.start();
		context.stop();
		context.refresh();
	}
}
