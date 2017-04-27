package com.bizruntime.depndencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Depndency_Injection.xml");
		Student student = (Student) context.getBean("depend");
		student.printData();
	}
}
