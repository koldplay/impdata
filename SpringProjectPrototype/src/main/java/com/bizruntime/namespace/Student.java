package com.bizruntime.namespace;

public class Student {
	
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
	public void printData() {
		System.out.println("Print Student Data");
		System.out.println(name);
		System.out.println(rollno);
	}
}
