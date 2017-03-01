package com.bizruntime.stocktradetask2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.bizruntime.stocktradetask2.StockTrade.arrangerData;


public class App 
{
    public static void main( String[] args )throws IOException
    {
    	App a1 = new App();
    	
		File f1 = new File("D:\\Task\\task2\\CISCO.txt");
		List<StockTrade> list = new ArrayList<>();
		String s1 = null;
		try(FileReader file = new FileReader(f1);
			BufferedReader br = new BufferedReader(file)) {
			while ((s1 = br.readLine())!=null) {
				br.readLine();
				//System.out.println(s1);
				list.add(parseStockLine(s1));		
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
		a1.getMaxQuantityTrade(list);
 }


	private static StockTrade parseStockLine(String csLine){
    	System.out.println(csLine);
		StockTrade stock = new StockTrade();

    	InputStream inputStream;
    	try {
			Properties prop = new Properties();
			String propertiesFileName = "D:\\Task\\task2\\StocktradeConfig.properties";
			
			inputStream = new FileInputStream(propertiesFileName);
			prop.load(inputStream);
			
			
			String sequre = prop.getProperty("security");
			String close  = prop.getProperty("close");
			String low = prop.getProperty("low");
			String adj_close = prop.getProperty("adj_close");
			String open = prop.getProperty("open");
			String high = prop.getProperty("high");
			String date = prop.getProperty("date");
			String qun = prop.getProperty("quantity");
			
			
			String[] sequ = sequre.split("-");
			String[] close1 = close.split("-");
			String[] lo = low.split("-");
			String[] ad = adj_close.split("-");
			String[] op = open.split("-");
			String[] hi = high.split("-");
			String[] dat = date.split("-");
			
			stock.setSecurity(csLine.substring(Integer.parseInt(sequ[0]), Integer.parseInt(sequ[1])));
			stock.setClose(Double.parseDouble(csLine.substring(Integer.parseInt(close1[0]),Integer.parseInt(close1[1]))));
			stock.setLow(Double.parseDouble(csLine.substring(Integer.parseInt(lo[0]),Integer.parseInt(lo[1]))));
			stock.setAdj_Class(Double.parseDouble(csLine.substring(Integer.parseInt(ad[0]),Integer.parseInt(ad[1]))));
			stock.setOpen(Double.parseDouble(csLine.substring(Integer.parseInt(op[0]),Integer.parseInt(op[1]))));
			stock.setHigh(Double.parseDouble(csLine.substring(Integer.parseInt(hi[0]),Integer.parseInt(hi[1]))));
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date dateof = null;
			try {
				dateof = formatter.parse(csLine.substring(Integer.parseInt(dat[0]),Integer.parseInt(dat[1]) ));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			stock.setDate(dateof);
			stock.setQuantity(Integer.parseInt(csLine.substring(Integer.parseInt(qun))));

		} 
		catch (Exception e) {
			e.printStackTrace();
		}	
		
		return stock;		
	}
	@SuppressWarnings("unused")
	private String[] convertLineInArray(String csLine){
		return null;
		
	}
	public StockTrade getMaxQuantityTrade(List<StockTrade> list) 	{
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrade().new arrangerData());
		System.out.println(list.get(list.size()-1));
		return list.get(0);
	}
}
