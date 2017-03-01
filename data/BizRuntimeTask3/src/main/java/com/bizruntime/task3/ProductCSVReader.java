/**
 * ProductCSVReader class is used for reading Product.csv file.
 * @version 1.0
 * @since 11-02-2017
 * 
 * */

package com.bizruntime.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public class ProductCSVReader {
	
	/**
	 * Declaration of all the constants and object.
	 * */
	final static Logger LOGGER = Logger.getLogger(ProductCSVReader.class);
	public static final String CSVPRODUCT_LOC = "Product.csv";
	/**
	 * Defination of getAllProducts where is reading file through class path resources.
	 * whose return type is list type.
	 * @throws ProductFileNotFoundException
	 * @throws ProductIOException
	 * Both are user Defined exception.
	 * */
	public List<Product> getAllProducts(){
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVPRODUCT_LOC);
		//Scanner scanner = new Scanner(inputStream);
		
		List<Product> list = new ArrayList<>();
		String strread = null;
		try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))){
			while ((strread = bufferedReader.readLine())!= null ) {
				strread = bufferedReader.readLine();
				list.add(parseProductCsv(strread));
			}
			
		} catch (FileNotFoundException e) {
			LOGGER.warn("File Not Found Exception is generated");
			new ProductFileNotFoundException("file 'Product.csv' not found in class path", e);
		}catch (IOException e) {
			LOGGER.warn("IO Exception is generated");
			new ProductIOException("unable to read Product.csv file", e);
		}
			
		return list;
	}
	/**
	 * This  below parseProductCSV method which takes String as argument and return product type object.
	 * method parsing to there respective datatypes
	 * */
	public Product parseProductCsv(String strread) {
		if (strread  == null) {
			return null;
		}
		String[] strsplit = strread.split(",");
		String productId = strsplit[0];
		String ProductName = strsplit[1];
		String productCategory = strsplit[2];
		Double Price = Double.parseDouble(strsplit[3]);
		String citylist = strsplit[4];
		String[] citysplit = citylist.split("/");
		List<String> list_city = Arrays.asList(citysplit);		
		return new Product(productId, ProductName,productCategory, Price,list_city);
	}
}
