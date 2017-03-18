/**
 * This is class which is used for reading data from csv file.
 * In this class we are implementing IUserDAO interface.
 * 
 * versio 1.0
 * since 17-02-2017
 * */
package com.bizruntime.UserProductRestEasy;
/**
 *imports and package defination. 
 * */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;
import com.bizruntime.exception.ResourceNotMatchedException;
/**
 * Defination of CSVUserDAOImpl.
 * */
public class CSVUserDAOImpl implements IUserDAO {

/**
 * Declaration of all the constants.
 * */	
	public static final Logger LOGGER = Logger.getLogger(CSVUserDAOImpl.class);
	public static final String CSVFILE_LOC = "User.csv";
	public static final String SPLITDELEME = ",";
/**
 * Defination of getAllUser method whose return type is List which is using User Generics type.
 * @throws DataReadException 
 * @throws DataResourcesNotFoundException
 * */
	
	public List<User> getAllUsers() throws DataReadException, DataResourcesNotFoundException {
		LOGGER.debug("getAllUsers method is starting to read data from source");
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVFILE_LOC);
		//Scanner scanner = new Scanner(inputStream);
		String readline;
		List<User> list = new ArrayList<>();
		LOGGER.info("File is found in class path");
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			@SuppressWarnings("unused")
			String headerArray = reader.readLine();
			while ((readline = reader.readLine()) != null) {
				LOGGER.debug("reading is started from source and start adding to list");
				list.add(pareseCSVLine(readline));//calling of pareseCSVLine method before adding to list.
			}

		} catch (FileNotFoundException e) {
			LOGGER.warn("source is not found in classpath");
			throw new DataResourcesNotFoundException("unable to finad data resource in class path", e);
		} catch (IOException e) {
			LOGGER.warn("unable to read data from source");
			throw new DataReadException("problem is occuring during reading from source",e);
		}
		LOGGER.info("all data is added to list");
		return list;
	}

	/**
	 * Defination of pareseCSVLine which takes input as String and return type is User type
	 * */
	private User pareseCSVLine(String readline) {
		LOGGER.debug("parsing of data is started to there subsiquent data type");
		if (readline == null) {
			return null;
		}
		String[] strarray = readline.split(SPLITDELEME);
		User user = new User();
		user.setUserId(strarray[0]);
		user.setUsername(strarray[1]);
		user.setEmail(strarray[2]);
		user.setPhoneNumber(strarray[3]);
		user.setCity(strarray[4]);
		LOGGER.info("Data is parsed");
		return user;
	}

//	@Override
//	public void addDataToDb() throws DataReadException, DataResourcesNotFoundException, ResourceNotMatchedException {
//		throw new ResourceNotMatchedException("try to data from CSV file Through class path");
//		
//	}
//
//	@Override
//	public void updateDataToDb() throws DataReadException, DataResourcesNotFoundException, ResourceNotMatchedException {
//		throw new ResourceNotMatchedException("try to data from CSV file Through class path");
//		
//	}
//
//	@Override
//	public void deleteDataToDb() throws DataReadException,DataResourcesNotFoundException ,ResourceNotMatchedException{
//		throw new ResourceNotMatchedException("try to data from CSV file Through class path");
//		
//	}


}
