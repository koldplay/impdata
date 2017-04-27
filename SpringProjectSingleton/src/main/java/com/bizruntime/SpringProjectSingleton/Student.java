package com.bizruntime.SpringProjectSingleton;

public class Student {
	
	private int rollno;
	private String name;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	public Student(String name , int rollno) {
//		this.rollno = rollno;
//		this.name = name;
//	}
	
	public void studentDetail() {
		System.out.println("Student Detail");
		System.out.println(name);
		System.out.println(rollno);
	}
}
