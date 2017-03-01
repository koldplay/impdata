/*
 * Stock Trade problem that impliments 
 * read the files from the ClassPath using classloader 
 * Every Exception is Wrapped under CustomizedException( e.g.StockTradeInValidFormatException,
 * StockTradeFileReaderException)
 * Every Exception is public static final.
 * In this Task there is two file CISCO.txt , StockTradeConfig.properties.
 * 
 * @version 1.0  
 * @since 06/02/2017 
 * {@com.bizruntime.StockTradeTask2.StockTradeReader#STOCKTRADE_FILE
 * 	@com.bizruntime.StockTradeTask2.StockTradeReader#LOGGER
 * 	@com.bizruntime.StockTradeTask2.StockTradeReader#PROPERTY
 * 	@com.bizruntime.StockTradeTask2.StockTradeReader#FORMATTER }
 * */



package com.bizruntime.stocktradetask2;

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
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

public class StockTradeReader implements IStockTradeReader {
	public static final Logger LOGGER = Logger.getLogger(StockTradeReader.class);//Attachment of Loggers Object
	public static ResourceBundle PROPERTY = null ; 
	public static SimpleDateFormat FORMATTER  = null;
	public static final String CSVCISCO_FILELOC = "CISCO.txt";
	public static final String PROPERTIESFILE_LOC = "StocktradeConfig";
	
	public List<StockTrade> readStockTrades() throws StockTradeInValidFormatException, StockTradeParseException, StockTradeFileReaderException {
		/*
		 * Implimentation of readStockTrade method which is used for reading all the stocks form CISCO.txt file
		 *,storing inside list and using customized Exception of StockTradeFileReaderException.
		 * this file having testing method inside junit test 
		 * 
		 * */
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVCISCO_FILELOC);
		List<StockTrade> list = new ArrayList<>();//List is initialized
		String read_line = null;
		try (BufferedReader buffre_Reader = new BufferedReader(new InputStreamReader(inputStream))) {
			while ((read_line = buffre_Reader.readLine()) != null) {
				LOGGER.info(read_line);
				read_line = buffre_Reader.readLine();
				
				list.add(parseStockLine(read_line));
				LOGGER.info("list is goning to end" + list);
				LOGGER.info(read_line);
			}
		} catch (FileNotFoundException e) {
			LOGGER.warn("File not found Exception");
			//customized Exception
			throw new StockTradeFileReaderException("Exception cause : File not found in Desired location");
		} catch (IOException e) {
			LOGGER.warn("IOException is generatted");
			//customized Exception
			throw new StockTradeFileReaderException("Exception cause : IO is generating Exception", e);
		}
		return list;
	}

	public StockTrade getMaxQuantityTrade(List<StockTrade> list) {
		/*
		 * This is method is for getting maximum quantity form list.
		 * 
		 * */		
		LOGGER.info("Getting Maximum Value method starts");
		if (list == null) {
			LOGGER.debug("Checking whether list is empty or not");
			return null;
		}
		LOGGER.info("Getting Maximum Value method ends");
		Collections.sort(list, new StockTrade().new arrangerData());
		return list.get(list.size() - 1);
	}

	public StockTrade getMinQuantityTrade(List<StockTrade> list) {
		/*
		 * This is method is for getting minimum quantity form list.
		 * 
		 * */				
		LOGGER.info("Getting Minimum Value method starts");
		if (list == null) {
			LOGGER.debug("Checking whether list is empty or not");
			return null;
		}
		LOGGER.info("Getting Minimum Value method ends");
		Collections.sort(list, new StockTrade().new arrangerData());
		return list.get(0);
	}

	public Map<Date, Double> getDailyTradingDifferential(List<StockTrade> list) {
		/*
		 * This method is Addiing Data into the Map by key as Date and value is as value of Open and High.
		 * GetDailyTradingDifferential 
		 * */
		LOGGER.info("Inserting data in map started");
		Map<Date, Double> map = new HashMap<>();
		int size = list.size();
		int startIndex = 0;

		while (startIndex < size) {
			StockTrade read = list.get(startIndex);
			Date date = read.getDate();
			Double value = read.getHigh() - read.getOpen();
			map.put(date, value);
			startIndex++;
		}
		LOGGER.info("Inserting data in map ended");
		return map;
	}

	private StockTrade parseStockLine(String csLine) throws StockTradeParseException, StockTradeFileReaderException , IOException{		
		/*
		 * Implementing parseStockLine method with customized Exception
		 * StockTradeParseException,StockTradeFileReaderException.
		 * Each data of CISCO.txt file is parsed to it's own data type.
		 * 
		 * */
		
		StockTrade stock = new StockTrade();//initailization of StockTrade object
		LOGGER.info("Parsing according to Properties File");
		try {
			String[] indexarray = null;
			PROPERTY = ResourceBundle.getBundle(PROPERTIESFILE_LOC);
			Enumeration<String> indexofproperties = PROPERTY.getKeys();
			String indexofproperty = null;
			
			while (indexofproperties.hasMoreElements()) {
				indexofproperty = indexofproperties.nextElement();
				indexarray = convertLineInArray(indexofproperty);
				
				LOGGER.info(indexofproperty);
				switch (indexofproperty) {
				case "security":
					stock.setSecurity(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;
				case "close":
					stock.setClose(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1]))));
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;
				case "low":
					stock.setLow(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1]))));
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;
				case "open":
					stock.setOpen(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1]))));
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;
				case "high":
					stock.setHigh(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1]))));
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;
				case "date":
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					Date date = null;
					try {
						date = dateFormat.parse(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));
					} catch (ParseException e) {
						e.printStackTrace();
					}
					stock.setDate(date);
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;
				case "adj_close":
					stock.setAdj_Class(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1]))));
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;
				case "quantity":
					stock.setQuantity(Integer.parseInt(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1]))));
					LOGGER.info(csLine.substring(Integer.parseInt(indexarray[0]),Integer.parseInt(indexarray[1])));	
					break;

				default:
					break;
				}
				
//				if (indexofproperty == "security") {
//					
//					LOGGER.info("mess");
//					stock.setSecurity(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1])));
//					LOGGER.info("message"+csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1])));
//				}else if (indexofproperty == "close") {
//					stock.setClose(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1]))));
//				}else if (indexofproperty == "low") {
//					stock.setLow(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1]))));
//				}else if (indexofproperty == "adj_close") {
//					stock.setAdj_Class(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1]))));
//				}else if (indexofproperty == "open") {
//					stock.setOpen(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1]))));
//				}else if (indexofproperty == "high") {
//					stock.setHigh(Double.parseDouble(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1]))));
//				}else if (indexofproperty == "date") {
//					FORMATTER = new SimpleDateFormat("MM/dd/yyyyy");
//					Date dateof = null;
//					try {
//						dateof = FORMATTER.parse(csLine.substring(Integer.parseInt(indexarray[0]), Integer.parseInt(indexarray[1])));
//					} catch (ParseException e) {
//						throw new StockTradeParseException("Exception is generated by Date Parseing", e);
//					}
//					stock.setDate(dateof);
//				}else if (indexofproperty == "quantity") {
//					stock.setQuantity(Integer.parseInt(csLine.substring(Integer.parseInt(indexarray[0]))));
//				}				
//				
				
				

			}
			//Reading Properties file and getting value of properties.
			/*
			 * Geting range from Array of Strings.
			 * with subsequent index.
			 * */			
			
//			String[] close_range = indexarray[1].split("-");
//			String[] low_range = indexarray[2].split("-");
//			String[] adj_close_range = indexarray[3].split("-");
//			String[] open_range = indexarray[4].split("-");
//			String[] high_range = indexarray[5].split("-");
//			String[] date_range = indexarray[6].split("-");
//			String quantity_range = indexarray[7].substring(0);
			/*
			 * Reading Data from CISCO.txt and Adding to StockTrade Object.
			 * Through subString Method and Parsing to it subsiquent Datatype.
			 *  
 			 * */
			
//			stock.setSecurity(csLine.substring(Integer.parseInt(sequrity_Range[0]), Integer.parseInt(sequrity_Range[1])));
//			stock.setClose(Double.parseDouble(csLine.substring(Integer.parseInt(close_range[0]), Integer.parseInt(close_range[1]))));
//			stock.setLow(Double.parseDouble(csLine.substring(Integer.parseInt(low_range[0]), Integer.parseInt(low_range[1]))));
//			stock.setAdj_Class(Double.parseDouble(csLine.substring(Integer.parseInt(adj_close_range[0]), Integer.parseInt(adj_close_range[1]))));
//			stock.setOpen(Double.parseDouble(csLine.substring(Integer.parseInt(open_range[0]), Integer.parseInt(open_range[1]))));
//			stock.setHigh(Double.parseDouble(csLine.substring(Integer.parseInt(high_range[0]), Integer.parseInt(high_range[1]))));

			//using date formatter for formating date.
//			FORMATTER = new SimpleDateFormat("MM/dd/yyyyy");
//			Date dateof = null;
//			try {
//				dateof = FORMATTER.parse(csLine.substring(Integer.parseInt(date_range[0]), Integer.parseInt(date_range[1])));
//			} catch (ParseException e) {
//				throw new StockTradeParseException("Exception is generated by Date Parseing", e);
//			}
//			stock.setDate(dateof);
//			stock.setQuantity(Integer.parseInt(csLine.substring(Integer.parseInt(quantity_range))));

		} catch (NullPointerException e) {
			//Handling Exception with customized exception
			LOGGER.warn("Inputprintstring is throughing Exception");
			throw new StockTradeFileReaderException("This Exception is generated for Properties file Not Found");
		}
		return stock;//returning StockTrade object
	}

	private String[] convertLineInArray(String csLine) {
		/*
		 * This method is used for converting String properties file into 
		 * String array of properites value.
		 * for getting value for CISCO.txt file.
		 * 
		 * */
		String[] properiesFileValueArray =null;
		String sequr_value = PROPERTY.getString(csLine);
		properiesFileValueArray = sequr_value.split("-");
//		String close_value = PROPERTY.getString("close");
//		String low_value = PROPERTY.getString("low");
//		String adj_close_value = PROPERTY.getString("adj_close");
//		String open_value = PROPERTY.getString("open");
//		String high_value = PROPERTY.getString("high");
//		String date_value = PROPERTY.getString("date");
//		String quantity_value = PROPERTY.getString("quantity");		
		
		return properiesFileValueArray;
	}

}
