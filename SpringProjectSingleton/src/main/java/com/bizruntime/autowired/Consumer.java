package com.bizruntime.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowired_setter_constructor.xml");
		System.out.println("Data reading byType config");
		Student_setter student_setter_type1 = (Student_setter) context.getBean("student_setter_type");		
		student_setter_type1.studentDetail();
	
		System.out.println("Data reading byType config");
		Student_setter student_setter_type2 = (Student_setter) context.getBean("student_setter_type");		
		student_setter_type2.studentDetail();
	
		
		System.out.println("Data Reading byName config");
		Student_setter student_setter_name = (Student_setter) context.getBean("student_setter_name");		
		student_setter_name.studentDetail();
		
		System.out.println("Data Reading Constructor config");
		Student_constructor student_constructor = (Student_constructor) context.getBean("student_constructor");
		student_constructor.studentdata();
		
		System.out.println(student_setter_type1 == student_setter_type2);
		
	}
}
