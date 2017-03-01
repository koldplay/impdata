/**
 * This is custom Exception generated class which is used for 
 * throwing exception while reading data form data source. 
 * */

package com.bizruntime.task3.task3dao.exception;

/**
 * Defination of DataReadException exception class.
 * */
public class DataReadException extends Exception{

	private static final long serialVersionUID = 2350100339892245648L;
	public DataReadException() {
		super();
	}
	public DataReadException(String message ,Throwable cause) {
		super(message ,cause);
	}
	public DataReadException(String message ) {
		super(message);
	}
}
