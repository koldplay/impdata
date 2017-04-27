package com.bizruntime.propertiesinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springpropinject.xml");
		ConnectionPool pool = (ConnectionPool) context.getBean("cp");
	}
}
