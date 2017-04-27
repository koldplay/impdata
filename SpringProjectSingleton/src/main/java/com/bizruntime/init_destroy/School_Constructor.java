package com.bizruntime.init_destroy;

public class School_Constructor {

	private String studentName;
	private int rollno;
	
	public School_Constructor(String studentName,int rollno) {
		this.rollno = rollno;
		this.studentName = studentName;
	}
	
	private void init() {
		System.out.println("Init Method is working");
	}

	private void destroy() {
		System.out.println("Destroy method is working");
	}
}
