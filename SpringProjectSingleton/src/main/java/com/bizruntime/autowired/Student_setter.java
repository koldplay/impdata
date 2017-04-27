package com.bizruntime.autowired;

public class Student_setter {

	private School school;

	public void setSchool(School school) {
		this.school = school;
	}
	
	public void studentDetail() {
		System.out.println("data of student");
		System.out.println(school.getRollno());
		System.out.println(school.getBatch());
	}
}
