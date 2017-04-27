package com.bizruntime.factorymethod;

public class Student_setter {
	
	private String name;
	private int rollno;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	
	public static Student_setter printData() {
		System.out.println("Data of student");
		
		return new Student_setter();
	}
}
