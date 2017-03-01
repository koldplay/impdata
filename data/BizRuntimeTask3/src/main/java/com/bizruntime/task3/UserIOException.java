/**
 * UserIOException class is Exception class.
 * Which is having 3 constructor(2 is native constructor and 1 is Chain Exception class)
 * @version  1.0
 * @since 11-02-2017
 * */

package com.bizruntime.task3;

public class UserIOException extends Exception {
	private static final long serialVersionUID = 1L;
	public UserIOException() {
		super();
	}
	public UserIOException(String meassage) {
		super(meassage);
	}
	public UserIOException(String message ,Throwable cause) {
		super(message , cause);
	}
	public UserIOException(Throwable cause) {
		super(cause);
	}
}
