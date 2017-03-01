/**
 * User class is native class for UserCSVReader.
 * @version 1.0
 * @since 11-02-2017
 * */

package com.bizruntime.task3;

public class User {
	
	/**
	 * Declaration and initialization variable
	 * @param userId
	 * @param userName
	 * @param email
	 * @param phoneNumber
	 * @param city
	 * */
	private String userId;
	private String userName;
	private String email;
	private String phoneNumber;
	private String city;
	
	/**
	 * Default Constructor
	 * */
	public User(){
		
	}
	/**
	 * Argumented Constructor 
 	 * */
	public User(String userId , String userName ,String email ,String phoneNumber ,String city ){
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.city = city;
	}
	/**
	 * start of getter and setters
	 * */
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	/**
	 * @Override toString method
	*/
	public String toString() {
		
		
		return "(" +userId +","+ userName +","+ email+","+phoneNumber +","+ city+")" ;
	}
	
}
