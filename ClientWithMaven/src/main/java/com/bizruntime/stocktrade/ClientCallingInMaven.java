package com.bizruntime.stocktrade;

import java.util.List;

import org.apache.log4j.Logger;

public class ClientCallingInMaven {
	
	public static final Logger LOGGER = Logger.getLogger(ClientCallingInMaven.class);
	public void CallerMethod() throws StockTradeInValidFormatException_Exception{
		CSVStockTradeReaderService service = new CSVStockTradeReaderService();
		CSVStockTradeReader reader = service.getCSVStockTradeReaderPort();
		List<StockTrdae> list = reader.readStockTrades();
		LOGGER.info(list);
		StockTrdae tradeMin = reader.getMinVolumeTrade(list);
		LOGGER.info(tradeMin);
		StockTrdae tradeMax = reader.getMaxVolumeTrade(list);
		LOGGER.info(tradeMax);
	}
}
