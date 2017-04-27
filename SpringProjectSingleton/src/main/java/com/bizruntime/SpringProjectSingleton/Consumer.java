package com.bizruntime.SpringProjectSingleton;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("setter_constructer_single.xml");
		Student student_setter = (Student) context.getBean("student_setter");
		Student student_setter1 = (Student) context.getBean("student_setter");

		System.out.println(student_setter == student_setter1);
		student_setter.studentDetail();

	}
}
