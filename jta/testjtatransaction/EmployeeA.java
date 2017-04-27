package com.bizruntime.jta.testjtatransaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table (name="EMPLOYEEA")
public class EmployeeA {
	
	@Id
	@Column(name="ID" , nullable = false)
	private String Id;
	
	@Id
	@Column(name="NAME" , nullable = false)
	private String name;
	
	@Id
	@Column(name="AGE" , nullable = false)
	private String age;
	
	public EmployeeA() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
