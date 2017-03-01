package com.bizruntime.testindao;

import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentDAO {

	List<Student> students;
	
	public StudentImpl() {
		students = new ArrayList<Student>();
		Student student = new Student("Rohit", 1);
		Student student2 = new Student("varun", 2);
		students.add(student);
		students.add(student2);
	}
	
	public List<Student> getAllStudents() {
		
		return students;
	}

	public Student getStudent(int rollno) {
	
		return students.get(rollno);
	}

	   public void updateStudent(Student student) {
		      students.get(student.getRollno()).setName(student.getName());
		      System.out.println("Student: Roll No " + student.getRollno() + ", updated in the database");
	}

	public void deleteStudent(Student student) {
		students.remove(student.getRollno());
		System.out.println(student.getRollno());
	}

}
