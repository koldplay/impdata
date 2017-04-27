package com.bizruntime.databaseconnection;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("databaseconnection_setter.xml");
		DBUtil util = (DBUtil) context.getBean("connection");
		util.getConnection();		
		util.conDestroy();
		
		DBUtil util_again = (DBUtil) context.getBean("connection");
		System.out.println(util == util_again);
	}
}
