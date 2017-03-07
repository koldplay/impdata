package com.bizruntime.stocktrade;

import java.util.List;

public interface IStockTradeReader {
	public List<StockTrdae> readStockTrades() throws StockTradeInValidFormatException;
}
