/**
 * @version 1.0
 * @since 12-02-2017
 * This class ProductCSVReader is for reading CSV File from CLassPath Resources.
 * reading from Product.csv file and adding to map. 
 * All this working is done inside getAllProducts method.
 * return type of this method is List type of Product . 
 * */

package com.bizRuntime.task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


import org.apache.log4j.Logger;

public class ProductCSVReader {

	/**
	 * Declaration of constant and initialaization of LOGGER object.
	 * 
	 * @param CSVFILE_LOC
	 * @param LOGGER
	 * @param SPLITER
	 */
	public static final Logger LOGGER = Logger.getLogger(ProductCSVReader.class);
	public static final String CSVFILE_LOC = "ProductDetail.csv";
	public static final String SPLITER = ",";
	public static final String TV = "TV";
	public static final String WASHIMGMACHINE = "WashinMachine";
	public static final String LAPTOP = "Laptop";
	public static final String MOBILE ="Mobile";
	/**
	 * File Reading is started using Input Stream class . Generating HashMap
	 * for list and making key as field name and value as row value.
	 * 
	 * @throws ProductCSVReaderFileNotFoundException
	 * @throws ProductCSVRead
	 * @throws ProductCSVReaderArrayIndexOutOfBoundException
	 */
	@SuppressWarnings("resource")
	public List<Product> getAllProducts() throws ProductCSVReaderFileNotFoundException{
		/**
		 * Declaration and Initialization of all variables. 
		 * */
		
		List<Product> list = new ArrayList<>();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVFILE_LOC);
		Scanner scanner = new Scanner(inputStream);
		Map<String, String> map = new HashMap<>();
		String[] headerArray = null;
		String readStr;
		String[] splitStr = null;

		
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			headerArray = bufferedReader.readLine().split(SPLITER);
			while ((readStr = bufferedReader.readLine())!= null) {
				splitStr = readStr.split(SPLITER);
				
				
				for (int i = 0; i < splitStr.length; i++) {
					map.put(headerArray[i], splitStr[i]);
				}
				if (map.get("productType").equalsIgnoreCase(LAPTOP)) {
					Laptop laptop = new Laptop();	
					laptop.buildProduct(map);
					list.add(laptop);
				}if (map.get("productType").equalsIgnoreCase(TV)) {
					TV tv = new TV();	
					tv.buildProduct(map);
					list.add(tv);
				}if (map.get("productType").equalsIgnoreCase(MOBILE)) {
					MobileDevice mobile = new MobileDevice();	
					mobile.buildProduct(map);
					list.add(mobile);
				}if (map.get("productType").equalsIgnoreCase(WASHIMGMACHINE)) {
					WashingMachine wash = new WashingMachine();	
					wash.buildProduct(map);
					list.add(wash);
				}
				LOGGER.info("productD" + list);
			}	
			
			
		} catch (FileNotFoundException e) {
			throw new ProductCSVReaderFileNotFoundException("Exception is generated due to File not found in classpath");
		}
		catch (IOException e) {
			throw new ProductCSVReaderFileNotFoundException("Exception is generated due to problem of reading file");
		}
		scanner.close();
		return list;
		
	}
}
