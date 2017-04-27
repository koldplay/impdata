package com.bizruntime.DataBaseConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("Databaseconnect.xml");
		DBUtil dbUtil = (DBUtil) context.getBean("connection");
		dbUtil.getConnection();
		dbUtil.destroyConnection();
	}
}	
