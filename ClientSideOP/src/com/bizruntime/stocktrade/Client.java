package com.bizruntime.stocktrade;

public class Client {
	
	public static void main(String[] args) throws StockTradeInValidFormatException_Exception {
		CSVStockTradeReaderService readerService = new CSVStockTradeReaderService();
		CSVStockTradeReader csvStockTradeReader = readerService.getCSVStockTradeReaderPort();
		System.out.println(csvStockTradeReader.readStockTrades());
	}
}
