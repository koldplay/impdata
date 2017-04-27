package com.bizruntime.lifcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springlife.xml");
		Bank bank = (Bank) context.getBean("life");
		bank.deposite();
		bank.widraw();
		bank.calInt();
	}
}
