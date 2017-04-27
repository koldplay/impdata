package com.bizruntime.init_destroy;

public class Student_setter {

	private School school ;

	public void setSchool(School school) {
		this.school = school;
	}
	
	private void init() {
		System.out.println("inti method is working");
	}
	
	public void studentData() {
		System.out.println("Data of student");
		System.out.println(school.getRollno());
		System.out.println(school.getStudentName());
	}
	
	private void destroy() {
		System.out.println("destroy method is working");
	}
}
