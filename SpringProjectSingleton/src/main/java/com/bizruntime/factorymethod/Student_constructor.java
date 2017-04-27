package com.bizruntime.factorymethod;

public class Student_constructor {
	
	private String name;
	private int rollno;
	
	public Student_constructor(String name ,int rollno) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public Student_constructor() {
		// TODO Auto-generated constructor stub
	}
	
	public static Student_constructor printData(String name , int rollno) {
		System.out.println("Data of student");
		System.out.println(name);
		System.out.println(rollno);
		return new Student_constructor();
	}
}
