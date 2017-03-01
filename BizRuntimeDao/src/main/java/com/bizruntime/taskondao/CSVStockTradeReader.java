package com.bizruntime.taskondao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.apache.log4j.Logger;

import com.bizruntime.exception.CSVReaderClassCastException;
import com.bizruntime.exception.CSVReaderParseException;
import com.bizruntime.exception.CSVReaderSQLException;
import com.bizruntime.exception.StockTradeIOException;
import com.mysql.jdbc.PreparedStatement;



public class CSVStockTradeReader implements IStockTradeReaderDAO {

	
	public static final Logger LOGGER = Logger.getLogger(CSVStockTradeReader.class);
	public static final DBUtil DB_UTIL = new DBUtil();
	
	public List<StockTrade> readStockTrades() throws  CSVReaderClassCastException,CSVReaderSQLException, StockTradeIOException {
		String query = "select * from stocktrade";
		List<StockTrade> list = new ArrayList<>();
		//DBUtil dbutil = new DBUtil();
		
		try (Connection con = DB_UTIL.getDBUTIL();
				Statement stmt = con.createStatement();
			 ResultSet result = stmt.executeQuery(query)){
			 
			 while (result.next()) {
				list.add(parseStockCSVLine(result));
			}
			 deleteStockCSVLine(result);
			 updateStockCSVLine(result);
		} catch (SQLException e) {
			throw new CSVReaderSQLException("unable to access database koldplay in table stocktrade",e);
		}
		return list;
	}

	public StockTrade getMaxVolumeTrade(List<StockTrade> list) {
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrade().new arrangerData());
		return list.get(list.size()-1);
	}

	@Override
	public StockTrade getMinVolumeTrade(List<StockTrade> list) {
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrade().new arrangerData());
		return list.get(0);
	}

	@Override
	public Map<Date, Double> getDailyTradingDifferential(List<StockTrade> list) {
		if (list == null) {
			return null;
		}
		Map<Date, Double> map = new HashMap<>();
		int startindex = 0;
		int size = list.size();
		
		while (startindex < size) {
			StockTrade stock = list.get(startindex);
			Date date = stock.getDate();
			Double difference = stock.getHigh() - stock.getOpen();
			map.put(date, difference);
		}
		return map;
	}
	
	
	private static StockTrade parseStockCSVLine(ResultSet csLine) throws SQLException{
		StockTrade stock = new StockTrade();
		if (csLine  == null) {
			return null;
		}else{
			
			stock.setSecurity(csLine.getString(1));
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = null;
			try {
				date = dateFormat.parse(csLine.getString(2));
			} catch (ParseException e) {
				new CSVReaderParseException("unable to parse date type", e);
			}
			stock.setDate(date);
			stock.setOpen(Double.parseDouble(csLine.getString(3)));
			stock.setHigh(Double.parseDouble(csLine.getString(4)));
			stock.setLow(Double.parseDouble(csLine.getString(5)));
			stock.setClose(Double.parseDouble(csLine.getString(6)));
			stock.setVolume(Double.parseDouble(csLine.getString(7)));
			stock.setAdj_Close(Double.parseDouble(csLine.getString(8)));
		}
		return stock;
		
	}

	private static void deleteStockCSVLine(ResultSet csLine) throws SQLException, StockTradeIOException, CSVReaderClassCastException, CSVReaderSQLException{
		String query = "delete from stocktrade where date = ?";
		try (Connection con =  DB_UTIL.getDBUTIL();
			  java.sql.PreparedStatement pStatement = con.prepareStatement(query)){
			pStatement.setDate(1,java.sql.Date.valueOf("2013-11-25"));
			int result = pStatement.executeUpdate();
			LOGGER.info(result);
		} catch (SQLException e) {
			throw new CSVReaderSQLException("unable read data from table stock trade", e);
		}
	}
	private static void updateStockCSVLine(ResultSet csLine) throws StockTradeIOException, CSVReaderClassCastException, CSVReaderSQLException{
		String query = "UPDATE koldplay.stocktrade SET  close = 21.89 WHERE date = '2013-11-22'";
		try(Connection con = DB_UTIL.getDBUTIL();
			java.sql.PreparedStatement pStatement = con.prepareStatement(query)) {
			pStatement.setDouble(6, 21.89);
			int result = pStatement.executeUpdate();
			LOGGER.info(result);
		} catch (SQLException e) {
			throw new CSVReaderSQLException("", e);
		}
	}

}
