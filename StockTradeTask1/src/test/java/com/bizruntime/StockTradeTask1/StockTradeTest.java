package com.bizruntime.StockTradeTask1;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class StockTradeTest {
	
	public static final Logger logger = Logger.getLogger(StockTradeTest.class);
	@Test
	public void testGetMinVolumeTrade() throws Exception {
		logger.info("Tesing Unit for GetMinValue from list");
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTradeTest> list = csv.readStockTrades();
		assertEquals("17.01" ,csv.getMinVolumeTrade(list).getLow().toString());
		logger.info("Tesing Unit for GetMinValue from list is ended");
	}
	@Test
	public void testGetMaxVolumeTrade() throws Exception {
		logger.info("Tesing Unit for GetMaxValue from list");
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTradeTest> list = csv.readStockTrades();
		//csv.getMaxVolumeTrade(list);
		assertEquals("21.440001", csv.getMaxVolumeTrade(list).getHigh().toString());
		logger.info("Tesing Unit for GetMAxValue from list ends");
	}
	@Test
	public void testGetDailyTradingDifferential() throws Exception {
		logger.info("Tesing Unit for GetMapValue from list");
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTrade> list = csv.readStockTrades();
		csv.getDailyTradingDifferential(list);
		logger.info("Tesing Unit for GetMapValue from list end");
	}

}
