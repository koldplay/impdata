package com.bizruntime.exception;

public class StockTradeIOException extends Exception {

	private static final long serialVersionUID = 1L;

	public StockTradeIOException() {
		super();
	}
	public StockTradeIOException(String message , Throwable cause) {
		super(message,cause);
	}
	public StockTradeIOException(String message) {
		super(message);
	}
}
