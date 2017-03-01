package com.bizruntime.testindao;

public class Student {
	private String name;
	private int rollno;
	
	public Student(String name , int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "("+name+","+rollno+")";
	}
}
