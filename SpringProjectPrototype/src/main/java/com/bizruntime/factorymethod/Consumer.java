package com.bizruntime.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("factorymethod_setter_construct.xml");
		Student_setter student = (Student_setter) context.getBean("factory");
		System.out.println(student.getRollno());
		System.out.println(student.getName());
		
		Student_setter student1 = (Student_setter) context.getBean("factory");		
		System.out.println(student == student1);
		
		System.out.println("Constructor approach for factory");
		Student_constructor constructor = (Student_constructor) context.getBean("factoy_cons");
		Student_constructor constructor1 = (Student_constructor) context.getBean("factoy_cons");
		System.out.println(constructor == constructor1);
		
	}
	
}
