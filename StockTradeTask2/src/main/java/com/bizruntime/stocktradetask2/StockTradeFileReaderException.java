/*
 *This Exception Class which used to through FileReader Exception and IO Exception
 *
 * @version 1.0
 * @since 06/02/2017
 * @exception Throws StockTradeFileReaderException
 * */

package com.bizruntime.stocktradetask2;

public class StockTradeFileReaderException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public StockTradeFileReaderException(){
		super();
	}
	public StockTradeFileReaderException(String message ,Throwable inputStream){
		super(message , inputStream);
	}
	public StockTradeFileReaderException (String message){
		super(message);
	}
	
	
}
