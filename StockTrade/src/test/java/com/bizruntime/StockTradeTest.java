package com.bizruntime;

import static org.junit.Assert.*;

import java.util.List;


import org.junit.Test;

public class StockTradeTest {
	
	@Test
	public void testGetMinVolumeTrade() throws Exception {
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTrade> list = csv.readStockTrades();
		System.out.println(csv.getMinVolumeTrade(list));
		assertEquals("17.01" ,csv.getMinVolumeTrade(list).getLow().toString());
	}
	@Test
	public void testGetMaxVolumeTrade() throws Exception {
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTrade> list = csv.readStockTrades();
		//csv.getMaxVolumeTrade(list);
		assertEquals("21.440001", csv.getMaxVolumeTrade(list).getHigh().toString());
	}
	@Test
	public void testGetDailyTradingDifferential() throws Exception {
		CSVStockTradeReader csv = new CSVStockTradeReader();
		List<StockTrade> list = csv.readStockTrades();
		csv.getDailyTradingDifferential(list);
	}

}
