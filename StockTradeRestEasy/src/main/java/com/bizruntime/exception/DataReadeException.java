package com.bizruntime.exception;

public class DataReadeException extends Exception {

	private static final long serialVersionUID = 1L;
	public DataReadeException() {
		super();
	}
	public DataReadeException(String message ,Throwable cause) {
		super(message ,cause);
	}
	public DataReadeException(String message) {
		super(message);
	}
	public DataReadeException(Throwable cause) {
		super(cause);
	}
}
