package com.bizruntime.exception;

public class NoUserFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	public NoUserFoundException() {
		super();
	}
	public NoUserFoundException(String message) {
		super(message);
	}
	public NoUserFoundException(Throwable cause) {
		super(cause);
	}
	public NoUserFoundException(String message ,Throwable cause) {
		super(message ,cause);
	}
}
