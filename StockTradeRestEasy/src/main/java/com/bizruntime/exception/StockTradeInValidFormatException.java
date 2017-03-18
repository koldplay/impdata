package com.bizruntime.exception;

public class StockTradeInValidFormatException extends Exception {

	private static final long serialVersionUID = 1L;
	public StockTradeInValidFormatException() {
		super();
	}
	public StockTradeInValidFormatException(String message ,Throwable cause) {
		super(message ,cause);
	}
	public StockTradeInValidFormatException(String message) {
		super(message);
	}
	public StockTradeInValidFormatException(Throwable cause) {
		super(cause);
	}
}
