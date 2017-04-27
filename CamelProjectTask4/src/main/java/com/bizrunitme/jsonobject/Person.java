package com.bizrunitme.jsonobject;

import com.fasterxml.jackson.annotation.JsonView;

public class Person {

	@JsonView
	private String firstName = "john";
	@JsonView
	private String lastName = "deo";
	@JsonView
	private String city="texus";
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	
	
	
}
