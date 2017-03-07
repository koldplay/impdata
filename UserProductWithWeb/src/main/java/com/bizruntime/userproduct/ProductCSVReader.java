package com.bizruntime.userproduct;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService(targetNamespace = "http://userproduct.bizruntime.com/", portName = "ProductCSVReaderPort", serviceName = "ProductCSVReaderService")
public class ProductCSVReader {
	
	final static Logger LOGGER = Logger.getLogger(ProductCSVReader.class);
	public static final String CSVPRODUCT_LOC = "Product.csv";
	
	public List<Product> getAllProducts(){
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVPRODUCT_LOC);
				
		List<Product> list = new ArrayList<Product>();
		String strread = null;
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			while ((strread = bufferedReader.readLine())!= null ) {
				strread = bufferedReader.readLine();
				list.add(parseProductCsv(strread));
			}
			
		} catch (FileNotFoundException e) {
			LOGGER.warn("File Not Found Exception is generated");
			new ResourceNotFoundException("file 'Product.csv' not found in class path", e);
		}catch (IOException e) {
			LOGGER.warn("IO Exception is generated");
			new FileReaderException("unable to read Product.csv file", e);
		}
			
		return list;
	}

	public Product parseProductCsv(String strread) {
		if (strread  == null) {
			return null;
		}
		String[] strsplit = strread.split(",");
		Product product = new Product();
		product.setProductId(strsplit[0]);
		product.setProductName(strsplit[1]);
		product.setProductCategory(strsplit[2]);
		product.setPrice(Double.parseDouble(strsplit[3]));
		String[] splstr = strsplit[4].split("/");
		List<String> liststr = Arrays.asList(splstr);
		product.setAvailableCity(liststr);		
		return product; 
	}
}
