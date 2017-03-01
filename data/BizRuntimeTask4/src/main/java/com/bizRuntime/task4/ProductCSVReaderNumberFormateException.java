/**
 * User Defined Generated Exception classes.
 * This exception is having 3 constructor.
 * Where 2 is native constructor and 1 is Chain constructor.
 * @class name is ProductCSVReaderNumberFormateException
 * @version 1.0
 * @since 12-02-2017
 * 
 * */


package com.bizRuntime.task4;

public class ProductCSVReaderNumberFormateException  extends Exception{

	private static final long serialVersionUID = 1436957041424786753L;
	
	public ProductCSVReaderNumberFormateException() {
		super();
	}
	public ProductCSVReaderNumberFormateException(String message ,Throwable cause) {
		super(message , cause);
	}
	public ProductCSVReaderNumberFormateException(String message) {
		super(message);
	}
}
