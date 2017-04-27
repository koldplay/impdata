package com.bizruntime.depndencyinjection;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	
	private static final Logger LOGGER = Logger.getLogger(Student.class);
	
	private String name;
	private int rollno;
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void printData() {
		LOGGER.debug(name);
		System.out.println("Detail of Student");
		System.out.println(name);
		System.out.println(rollno);
	}
}
