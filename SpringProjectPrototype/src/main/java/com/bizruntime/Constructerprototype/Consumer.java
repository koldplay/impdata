package com.bizruntime.Constructerprototype;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("setter_construtor_prototype.xml");
		
		Student student_constucter = (Student) context.getBean("student_constructer");
		Student student_constucter1 = (Student) context.getBean("student_constructer");
		System.out.println(student_constucter == student_constucter1);
		student_constucter.studentDetail();
	}
}
