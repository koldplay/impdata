package com.bizruntime;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IStockTradeReader 
{
	public List<StockTrade> readStockTrades() throws StockTradeInValidFormatException;
	public StockTrade getMaxVolumeTrade(List<StockTrade> list);
	public StockTrade getMinVolumeTrade(List<StockTrade> list);
	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade> list);	
}