package com.bizruntime.taskondao;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.bizruntime.exception.CSVReaderClassCastException;
import com.bizruntime.exception.CSVReaderSQLException;
import com.bizruntime.exception.StockTradeIOException;

public class CSVReadTest {
	
	public static final Logger LOGGER = Logger.getLogger(CSVReadTest.class);
	@Test
	public void testReadStockTrades() throws  CSVReaderClassCastException,CSVReaderSQLException, StockTradeIOException{
		CSVStockTradeReader reader = new CSVStockTradeReader();
		List<StockTrade> list = reader.readStockTrades();
		LOGGER.info(list);
	}
	@Test
	public void testGetMinVolumeTrade() throws  CSVReaderClassCastException, CSVReaderSQLException, StockTradeIOException{
		CSVStockTradeReader reader = new CSVStockTradeReader();
		List<StockTrade> list = reader.readStockTrades();
		assertEquals("21.25",reader.getMinVolumeTrade(list).getLow().toString());
	}
	
	@Test
	public void testGetMaxVolumeTrade() throws  CSVReaderClassCastException, CSVReaderSQLException, StockTradeIOException{
		CSVStockTradeReader reader = new CSVStockTradeReader();
		List<StockTrade> list = reader.readStockTrades();
		assertEquals("21.49",reader.getMinVolumeTrade(list).getHigh().toString());
	}
//	@Test
//	public void testGetDailyTradingDifferential() throws StockTradeInValidFormatException, CSVReaderClassCastException, CSVReaderSQLException{
//		CSVStockTradeReader csReader = new CSVStockTradeReader();
//		List<StockTrade> list = csReader.readStockTrades();
//		Map<Date, Double> map = csReader.getDailyTradingDifferential(list);
//		LOGGER.info(map);
//	}

}
