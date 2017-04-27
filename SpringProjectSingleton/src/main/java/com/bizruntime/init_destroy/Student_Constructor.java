package com.bizruntime.init_destroy;

public class Student_Constructor {
	
	private School school;

	public Student_Constructor (School school) {
		this.school = school;
	}
	
	private void inti() {
		System.out.println("Init Method is working");
	}
	
	public void studentData() {
		System.out.println("Data of Student");
		System.out.println(school.getRollno());
		System.out.println(school.getStudentName());
	}
	
	private void destroy() {
		System.out.println("Destroy method is working");
	}
}
