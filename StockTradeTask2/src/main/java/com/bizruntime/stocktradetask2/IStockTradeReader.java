/*
 * This is interface for StockTradeReader .
 * Which is containig all unimplemented method with desierd Exception.
 * 
 * @version 1.0
 * @since 06/02/2017
 * */

package com.bizruntime.stocktradetask2;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface IStockTradeReader {

	public List<StockTrade> readStockTrades() throws StockTradeInValidFormatException, StockTradeParseException, StockTradeFileReaderException;
	public StockTrade getMaxQuantityTrade(List<StockTrade> list);
	public StockTrade getMinQuantityTrade(List<StockTrade> list);
	public Map<Date,Double> getDailyTradingDifferential(List<StockTrade> list);	
}
