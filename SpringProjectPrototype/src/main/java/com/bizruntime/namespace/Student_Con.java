package com.bizruntime.namespace;

public class Student_Con {
	

	private String name;
	private int rollno;
	
	public Student_Con() {
		
	}
	
	public Student_Con(String name , int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public void dataprint() {
		System.out.println(name);
		System.out.println(rollno);
	}
}
