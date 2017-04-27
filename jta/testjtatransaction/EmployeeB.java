package com.bizruntime.jta.testjtatransaction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="EMPLOYEEB")
public class EmployeeB {

	@Id
	@Column(name="ID" , nullable = false)
	private String Id;
	
	@Id
	@Column(name="NAME" , nullable = false)
	private String name;
	
	@Id
	@Column(name="AGE" , nullable = false)
	private String age;
	
	public EmployeeB() {
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
