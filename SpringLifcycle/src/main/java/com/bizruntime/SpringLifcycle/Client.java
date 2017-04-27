package com.bizruntime.SpringLifcycle;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws SQLException {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select 1 for save and 2 for close");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				Test test = (Test)context.getBean("t");
				int id = sc.nextInt();
				String name = sc.next();
				String email = sc.next();
				String address = sc.next();
				test.save(id, name, email, address);
				break;

			case 2:
				context.close();	
				break;
	
			default:
				break;
			}
		}
	}
}
