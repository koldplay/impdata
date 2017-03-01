package com.bizruntime.stocktradetask2;

public class StockTradeInValidFormatException extends Exception{
	

	private static final long serialVersionUID = 1L;

	public StockTradeInValidFormatException(){
		super();
	}
	public StockTradeInValidFormatException(String meassage , Throwable cause){
		super(meassage , cause);
	}
	public StockTradeInValidFormatException(String message){
		super(message);
	}
}
