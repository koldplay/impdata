/**
 * This is class which is used for reading data from csv file.
 * In this class we are implementing IProductDAO interface.
 * 
 * versio 1.0
 * since 17-02-2017
 * */

package com.bizruntime.UserProductRestEasy;
/**
 * There is all declarattion of imports and package
 * */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;

/**
 * defination of CSVProductImpl class.
 * 
 * */

public class CSVProductImpl implements IProductDAO {
/**
 * declaration of all the constants.
 * */
	public static final Logger LOGGER = Logger.getLogger(CSVProductImpl.class);
	public static final String CSVFILE_LOC = "Product.csv";
	public static final String SPLITDELEME = ",";
	public static final String SPLITERSLASH = "/";
/**
 * Defination of getAllProducts method which is throws 
 * @throws DataReadException 
 * @throws DataResourcesNotFoundException
 * */
	public List<Product> getAllProducts() throws DataReadException, DataResourcesNotFoundException {
		LOGGER.debug("getAllProducts method is started");
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVFILE_LOC);
		//Scanner scanner = new Scanner(inputStream);
		String readline;
		List<Product> list = new ArrayList<>();
		LOGGER.info("File loading is completed");
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			@SuppressWarnings("unused")
			String headerArray = reader.readLine();
			while ((readline = reader.readLine()) != null) {
				LOGGER.debug("Reading data from source is started");
				list.add(pareseCSVLine(readline));
			}

		} catch (FileNotFoundException e) {
			LOGGER.warn("File is not getting from classpath ");
			throw new DataResourcesNotFoundException("unable to find data source in class path", e);
		} catch (IOException e) {
			LOGGER.warn("while reading file problem is occured");
			throw new DataReadException("problem is occuring during reading from source csv file",e);
		}
		LOGGER.info("All data is converted to list formate");
		return list;
	}
	/**
	 * Defination of pareseCSVLine method which is taking the input as CSV Line and return type is 
	 * Product type.
	 * */
	
	private Product pareseCSVLine(String readline) {
		LOGGER.debug("parsing of data is started");
		if (readline == null) {
			return null;
		}
		String[] strarray = readline.split(SPLITDELEME);
		Product product = new Product();
		product.setProductId(strarray[0]);
		product.setProductName(strarray[1]);
		product.setProductCategory(strarray[2]);
		product.setPrice(Double.parseDouble(strarray[3]));
		String[] cityList = strarray[4].split(SPLITERSLASH);
		List<String> citylist = Arrays.asList(cityList);
		product.setAvailableCity(citylist);
		LOGGER.debug("data is parsed to its subsequent datatype");
		return product;
	}
	@Override
	public void deleteDataDb(String productId) throws IOException, DataReadException, DataResourcesNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
