

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService(targetNamespace = "http://default_package/", portName = "CSVStockTradeReaderPort", serviceName = "CSVStockTradeReaderService")
public class CSVStockTradeReader implements IStockTradeReader{

	final static Logger logger = Logger.getLogger(CSVStockTradeReader.class);
	public static final String CSVCISCO_LOC="CISCO.csv";
	

	public List<StockTrdae> readStockTrades() throws StockTradeInValidFormatException
	{
		
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVCISCO_LOC);
		
		
		
		List<StockTrdae> list =  new ArrayList<StockTrdae>();
		String s1 = null;
		try 
		{	
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			while ((s1 = br.readLine()) !=null) 
			{	
				s1= br.readLine();
				list.add(parseStockCSVLine(s1));
				logger.error("There is problem in adding into list");
				logger.info("File is successfully inserted into list"+list);
			}
		} 
		catch (FileNotFoundException e) 
		{
			logger.warn("There is Filenotfound exception", e);
			
		}
		catch (IOException e) 
		{
			logger.warn("There is an IOException", e);			
		}

		return list;
	}

	
	public StockTrdae getMaxVolumeTrade(@WebParam(name="ada") List<StockTrdae> list)
	{
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrdae().new arrangerData());
		return list.get(list.size()-1);
	}

	public StockTrdae getMinVolumeTrade(List<StockTrdae> list) 
	{
		logger.info("GetMinVolume method is started");
		if (list == null) 
		{
			return null;
		}
		Collections.sort(list, new StockTrdae().new arrangerData());
		
		return list.get(0);
	}


	public Map<Date, Double> getDailyTradingDifferential(List<StockTrdae> list) 
	{
		logger.trace("method getDailyTradingDifferential is started");
		logger.info("Inserting data in map started");
		Map<Date, Double> map = new HashMap<Date, Double>();
		int size = list.size();
		int startIndex = 0;
		
		while (startIndex<size) {
			StockTrdae read = list.get(startIndex);
			Date date = read.getDate();
			Double value = read.getHigh() - read.getOpen();
			map.put(date, value);
			startIndex++;
		}		
		logger.info("Inserting data in map ended");
		return map;
	}
	private static StockTrdae parseStockCSVLine(String csLine) throws StockTradeInValidFormatException 
	{
		logger.trace("parseStockCSVLine method is started");
		String[] sp = csLine.split(",");
		StockTrdae  stock = new StockTrdae();
		stock.setSecurity(sp[0]);
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date date = null ;
		logger.info("date is starting parsing");
		try 
		{
			logger.debug("parsing of date started");
			date =formatter.parse(sp[1]);
			stock.setDate(date);
		} 
		catch (ParseException e) 
		{
			logger.error(e);
		}
		stock.setOpen(Double.parseDouble(sp[2]));
		stock.setHigh(Double.parseDouble(sp[3]));
		stock.setLow(Double.parseDouble(sp[4]));
		stock.setClose(Double.parseDouble(sp[5]));
		stock.setVolume(Double.parseDouble(sp[6]));
		stock.setAdj_Close(Double.parseDouble(sp[7]));
		logger.info("Starting of parseing"); 
		logger.trace("parseStockCSVLine method is ended");
		return stock;
		
	}

}
