package com.bizruntime.task3.task3dao.exception;

public class ResourceNotMatchedException extends Exception {

	private static final long serialVersionUID = 1L;
	public ResourceNotMatchedException() {
		super();
	}
	public ResourceNotMatchedException(String message ,Throwable cause) {
		super(message , cause);
	}
	public ResourceNotMatchedException(String message) {
		super(message);
	}
	public ResourceNotMatchedException(Throwable cause) {
		super(cause);
	}
}
