package com.bizruntime.exception;

public class UserCetgoryNotFoundException extends Exception {

	public UserCetgoryNotFoundException() {
		super();
	}
	public UserCetgoryNotFoundException(String message) {
		super(message);
	}
	public UserCetgoryNotFoundException(Throwable cause) {
		super(cause);
	}
	public UserCetgoryNotFoundException(String message ,Throwable cause) {
		super(message , cause);
	}
}	
