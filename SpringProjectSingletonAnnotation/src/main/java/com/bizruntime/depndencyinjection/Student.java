package com.bizruntime.depndencyinjection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@Component
@Scope("prototype")
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
	
	@Bean
	@Required	
	public String getName() {
		return name;
	}
	
	@Bean
	@Required	
	public int getRollno() {
		return rollno;
	}
	
	public void printData() {
		LOGGER.debug(name);
		System.out.println("Detail of Student");
		System.out.println(name);
		System.out.println(rollno);
	}
}
