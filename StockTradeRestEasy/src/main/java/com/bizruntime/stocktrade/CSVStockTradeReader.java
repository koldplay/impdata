package com.bizruntime.stocktrade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import com.bizruntime.exception.DataParseException;
import com.bizruntime.exception.DataReadeException;
import com.bizruntime.exception.ResourceNotFoundException;

public class CSVStockTradeReader implements IStockTradeReader{

	public static final Logger LOGGER = Logger.getLogger(CSVStockTradeReader.class);
	
	public static final String CSV_PATH = "CISCO.csv";
	public List<StockTrade> readStockTrades() throws ResourceNotFoundException, DataReadeException, DataParseException {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSV_PATH);
		String strread = null;
		List<StockTrade> liTrades = new ArrayList<>();
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){ 
				while (( strread = bufferedReader.readLine())!=null) {
					strread = bufferedReader.readLine();
					liTrades.add(parsecsvline(strread));
					LOGGER.debug(strread);
				}
			
		} catch (FileNotFoundException e) {
			throw new ResourceNotFoundException("unable to find csv file in class path", e);
		}catch (IOException e) {
			throw new DataReadeException("unable to read data from csv file", e);
		}
		LOGGER.debug(liTrades);
		return liTrades;
	}


	
	public StockTrade getMaxVolumeTrade(List<StockTrade> list)
	{
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrade().new arrangerData());
		return list.get(list.size()-1);
	}

		public StockTrade getMinVolumeTrade(List<StockTrade> list) {
		
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrade().new arrangerData());
		return list.get(0);
	}


		public Map<Date, Double> getDailyTradingDifferential(List<StockTrade> list) 
		{
			LOGGER.trace("method getDailyTradingDifferential is started");
			LOGGER.info("Inserting data in map started");
			Map<Date, Double> map = new HashMap<>();
			int size = list.size();
			int startIndex = 0;
			
			while (startIndex<size) {
				StockTrade read = list.get(startIndex);
				Date date = read.getDate();
				Double value = read.getHigh() - read.getOpen();
				map.put(date, value);
				startIndex++;
			}		
			LOGGER.info("Inserting data in map ended");
			return map;
		}
	private StockTrade parsecsvline(String strread) throws DataParseException {
		if (strread == null) {
			return null;
		}
		StockTrade stockTrade = new StockTrade();
		String[] strsplit = strread.split(",");
		stockTrade.setSecurity(strsplit[0]);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = dateFormat.parse(strsplit[1]);
			stockTrade.setDate(date);
		} catch (ParseException e) {
			throw new DataParseException("unable to parse from string to date type", e);
		}
		stockTrade.setOpen(Double.parseDouble(strsplit[2]));
		stockTrade.setHigh(Double.parseDouble(strsplit[3]));
		stockTrade.setLow(Double.parseDouble(strsplit[4]));
		stockTrade.setClose(Double.parseDouble(strsplit[5]));
		stockTrade.setVolume(Double.parseDouble(strsplit[6]));
		stockTrade.setAdj_Class(Double.parseDouble(strsplit[7]));
		
		return stockTrade;
	}
}
