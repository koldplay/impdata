package com.bizruntime.taskondao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bizruntime.exception.CSVReaderClassCastException;
import com.bizruntime.exception.CSVReaderSQLException;
import com.bizruntime.exception.StockTradeIOException;

public interface IStockTradeReaderDAO {
	
	public List<StockTrade> readStockTrades() throws  CSVReaderClassCastException, CSVReaderSQLException, StockTradeIOException;
	public StockTrade getMaxVolumeTrade(List<StockTrade> list);
	public StockTrade getMinVolumeTrade(List<StockTrade> list);
	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade> list);
}
