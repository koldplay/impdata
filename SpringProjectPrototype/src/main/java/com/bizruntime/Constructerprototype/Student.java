package com.bizruntime.Constructerprototype;

public class Student {
	
	private int rollno;
	private String name;
	

	
	public Student(String name , int rollno) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public void studentDetail() {
		System.out.println("Student Detail");
		System.out.println(name);
		System.out.println(rollno);
	}
}
