package com.bizruntime.UserProductRestEasy;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String userId ;
	private String username;
	private String email;
	private String phoneNumber;
	private String city;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String userId , String username , String email ,String phoneNumber , String city) {
		this.userId = userId;
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.city = city;		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
