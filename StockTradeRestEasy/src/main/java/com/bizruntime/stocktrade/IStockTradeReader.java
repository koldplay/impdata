package com.bizruntime.stocktrade;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bizruntime.exception.DataParseException;
import com.bizruntime.exception.DataReadeException;
import com.bizruntime.exception.ResourceNotFoundException;

public interface IStockTradeReader {
	
	public List<StockTrade> readStockTrades() throws ResourceNotFoundException ,DataReadeException ,DataParseException;
	public StockTrade getMaxVolumeTrade(List<StockTrade> list);
	public StockTrade getMinVolumeTrade(List<StockTrade> list);
	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade> list);	
}
