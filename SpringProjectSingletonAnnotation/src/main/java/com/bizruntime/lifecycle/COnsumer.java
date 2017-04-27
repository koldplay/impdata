package com.bizruntime.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class COnsumer {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		
		context.start();
		context.stop();
		context.refresh();
	}
}
