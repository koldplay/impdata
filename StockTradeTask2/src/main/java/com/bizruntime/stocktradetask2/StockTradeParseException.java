/*
 * This is customized Exception class.
 * This Exception class used for giving parsing Exception.
 * 
 * @version 1.0
 * @since 06/02/2017
 * @exception StockTradeParseException
 * */

package com.bizruntime.stocktradetask2;

public class StockTradeParseException  extends Exception{
	
	private static final long serialVersionUID = 1L;
	public StockTradeParseException(){
		super();
	}
	public StockTradeParseException(String message , Throwable cause){
		super(message , cause);
	}
	public StockTradeParseException(String message){
		super(message);
	}
}
