/**
 * This is custom Exception generated class which is used for 
 * throwing exception while data resource is not found. 
 * */


package com.bizruntime.task3.task3dao.exception;

/**
 * Defination of DataResourcesNotFoundException exception class.
 * */
public class DataResourcesNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	public DataResourcesNotFoundException() {
		super();
	}
	public DataResourcesNotFoundException(String message) {
		super(message);
	}
	public DataResourcesNotFoundException(String message ,Throwable cause) {
		super(message ,cause);
	}
	public DataResourcesNotFoundException(Throwable cause) {
		super(cause);
	}
}
