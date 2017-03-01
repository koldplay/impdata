package com.bizruntime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import au.com.bytecode.opencsv.CSVReader;


public class CSVStockTradeReader implements IStockTradeReader
{
	//attachement of loggger object.
	final static Logger logger = Logger.getLogger(CSVStockTradeReader.class);
	
	public List<StockTrade> readStockTrades() throws StockTradeInValidFormatException
	{
//		
//		try {
//			CSVReader reader = new CSVReader(new FileReader("D:\\Task\\task1\\Ex1StockTrade\\CISCO.csv"),',','"');
//			List<StockTrade> list = new ArrayList<>();
//			String[] nextLine;
//			try {
//				while ((nextLine=reader.readNext())!= null) {
//					
//					list.add(parseStockCSVLine(nextLine));
//					reader.readNext();
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		PropertyConfigurator.configure("log4j.properties");
		File f1 = new File("D:\\Task\\task1\\Ex1StockTrade\\CISCO.csv");
		List<StockTrade> list =  new ArrayList<>();
		String s1 = null;
		try(FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr)) 
		{		
			while ((s1 = br.readLine()) !=null) 
			{	
				s1= br.readLine();		
				list.add(parseStockCSVLine(s1));
				logger.info("File is successfully inserted into list"+list);				
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		System.out.println(new CSVStockTradeReader().getDailyTradingDifferential(list));
		return list;
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

	public StockTrade getMinVolumeTrade(List<StockTrade> list) 
	{
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrade().new arrangerData());
		return list.get(0);
	}


	public Map<Date, Double> getDailyTradingDifferential(List<StockTrade> list) 
	{

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
		return map;
	}
	private static StockTrade parseStockCSVLine(String csLine) throws StockTradeInValidFormatException 
	{
		String[] sp = csLine.split(",");
		String seq = sp[0];
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = null ;
		try 
		{
			date =formatter.parse(sp[1]);	
		} 
		catch (ParseException e) 
		{
			throw new StockTradeInValidFormatException("exception occuring in reading file",e);
		}
		 
		Double open = Double.parseDouble(sp[2]);
		Double high = Double.parseDouble(sp[3]);
		Double low = Double.parseDouble(sp[4]);
		Double close = Double.parseDouble(sp[5]); 
		Double vol = Double.parseDouble(sp[6]); 
		Double adj = Double.parseDouble(sp[7]);
		return new StockTrade(seq, date, open, high, low, close, vol, adj);
		
	}

}

