package com.bizruntime.stocktradepart1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.bizruntime.stocktradepart1.CSVStockTradeReader;
import com.bizruntime.stocktradepart1.StockTrade;

import junit.framework.TestCase;

public class StockTradeTest extends TestCase {
	public static final Logger logger = Logger.getLogger(StockTradeTest.class);
	@Test
	public void testGetMinVolumeTrade() throws Exception, StockTradeInValidFormatException {
		logger.info("Tesing Unit for GetMinValue from list");
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTrade> list = csv.readStockTrades();
		assertEquals("17.01" ,csv.getMinVolumeTrade(list).getLow().toString());
		logger.info("Tesing Unit for GetMinValue from list is ended");
	}
	@Test
	public void testGetMaxVolumeTrade() throws Exception, StockTradeInValidFormatException {
		logger.info("Tesing Unit for GetMaxValue from list");
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTrade> list = csv.readStockTrades();
		//csv.getMaxVolumeTrade(list);
		assertEquals("21.440001", csv.getMaxVolumeTrade(list).getHigh().toString());
		logger.info("Tesing Unit for GetMAxValue from list ends");
	}
	@Test
	public void testGetDailyTradingDifferential() throws Exception, StockTradeInValidFormatException {
		logger.info("Tesing Unit for GetMapValue from list");
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTrade> list = csv.readStockTrades();
		csv.getDailyTradingDifferential(list);
		logger.info("Tesing Unit for GetMapValue from list end");
	}


}
