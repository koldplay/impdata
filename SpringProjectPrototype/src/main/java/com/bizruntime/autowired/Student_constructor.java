package com.bizruntime.autowired;

public class Student_constructor {
	
	private School school;
	
	public Student_constructor(School school) {
		this.school = school;
	}

	public void studentdata() {
		System.out.println("data of student");
		System.out.println(school.getRollno());
		System.out.println(school.getBatch());
	}
	
}
