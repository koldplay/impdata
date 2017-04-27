package com.bizruntime.init_destroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("inti_destroy_setter_constructor.xml");
		
		System.out.println("inti destroy for setter approach");
		Student_setter student_setter = (Student_setter) context.getBean("student_setter");
		student_setter.studentData();
		
		System.out.println("inti destroy for constructor approach");
		Student_Constructor student_constructor = (Student_Constructor) context.getBean("student_constructor");
		student_constructor.studentData();
	}
}
