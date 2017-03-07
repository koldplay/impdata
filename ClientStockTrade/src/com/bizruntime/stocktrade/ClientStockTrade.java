package com.bizruntime.stocktrade;

import java.util.List;

public class ClientStockTrade {
	
	public static void main(String[] args) throws StockTradeInValidFormatException_Exception {
		
		CSVStockTradeReaderService readerService = new CSVStockTradeReaderService();
		CSVStockTradeReader reader = readerService.getCSVStockTradeReaderPort();
		List<StockTrdae> list = reader.readStockTrades();
		StockTrdae stockMax = reader.getMaxVolumeTrade(list);
		StockTrdae stockMin = reader.getMinVolumeTrade(list);
		System.out.println(list);
		System.out.println(stockMin);
		System.out.println(stockMax);
	}
}	
