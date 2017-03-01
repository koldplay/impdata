/**
 * User Defined Generated Exception classes.
 * This exception is having 3 constructor.
 * Where 2 is native constructor and 1 is Chain constructor.
 * @class name is ProductCSVReaderException
 * @version 1.0
 * @since 12-02-2017
 * 
 * */

package com.bizRuntime.task4;

public class ProductCSVReaderFileNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ProductCSVReaderFileNotFoundException() {
		super();
	}
	public ProductCSVReaderFileNotFoundException(String message , Throwable cause) {
		super(message ,cause);
	}
	public ProductCSVReaderFileNotFoundException(String message) {
		super(message);
	}
	
}
