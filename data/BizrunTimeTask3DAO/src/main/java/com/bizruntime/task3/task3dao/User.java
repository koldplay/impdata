/**
 * This is the Pojo class for CSVUserImpl and DBUserDAOImpl.
 * 
 * version 1.0
 * since 17-02-2017
 * */


package com.bizruntime.task3.task3dao;

/**
 * Decalartion of Packages.
 * */
public class User {
	
	/**
	 * @param userId
	 * @param username
	 * @param email
	 * @param phoneNumber
	 * @param city
	 * */
	private String userId ;
	private String username;
	private String email;
	private String phoneNumber;
	private String city;
	
	/**
	 * Getters and Setters
	 * */
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
	public String getEmial() {
		return email;
	}
	public void setEmial(String emial) {
		this.email = emial;
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
	
	@Override
	public String toString() {
		
		return "("+userId+","+username+","+email+","+phoneNumber+","+city+ ")";
	}
	
}
