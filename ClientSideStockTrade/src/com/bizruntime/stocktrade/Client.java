package com.bizruntime.stocktrade;

import java.util.List;

public class Client {

	public static void main(String[] args) throws StockTradeInValidFormatException_Exception {
		CSVStockTradeReaderService service = new CSVStockTradeReaderService();
		CSVStockTradeReader reader = service.getCSVStockTradeReaderPort();
		List<StockTrdae> list = reader.readStockTrades();
		System.out.println(list);
		
	}
}
