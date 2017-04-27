package com.bizruntime.namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cansumer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("namespace_setter_cons.xml");
		Student student = (Student) context.getBean("student_setter");
		student.printData();
		System.out.println(student.getName());
		
		Student_Con con = (Student_Con) context.getBean("student_con");
		con.dataprint();
		Student_Con con1 = (Student_Con) context.getBean("student_con");
		System.out.println(con == con1);	
	}
}
