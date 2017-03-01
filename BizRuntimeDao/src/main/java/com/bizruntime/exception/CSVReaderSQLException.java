package com.bizruntime.exception;

public class CSVReaderSQLException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public CSVReaderSQLException() {
		super();
	}
	
	public CSVReaderSQLException(String message ,Throwable cause) {
		super(message,cause);
	}
	
	public CSVReaderSQLException(String message) {
		super(message);
	}
}
