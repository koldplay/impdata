package com.bizruntime.testindao;

public class DAOPatternDemo {
	public static void main(String[] args) {
		StudentDAO dao  = new StudentImpl();
		
		for (Student student : dao.getAllStudents()) {
			System.out.println(student.getRollno()+","+student.getName());
		}
		Student student = dao.getAllStudents().get(0);
		student.setName("michal");
		dao.updateStudent(student);
		
		
		dao.getStudent(0);
		System.out.println(student.getName()+","+student.getRollno());
	}
}
