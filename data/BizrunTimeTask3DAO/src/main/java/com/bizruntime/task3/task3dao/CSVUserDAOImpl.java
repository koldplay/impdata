/**
 * This is class which is used for reading data from csv file.
 * In this class we are implementing IUserDAO interface.
 * 
 * versio 1.0
 * since 17-02-2017
 * */
package com.bizruntime.task3.task3dao;
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

import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;
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

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVFILE_LOC);
		//Scanner scanner = new Scanner(inputStream);
		String readline;
		List<User> list = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			@SuppressWarnings("unused")
			String headerArray = reader.readLine();
			while ((readline = reader.readLine()) != null) {

				list.add(pareseCSVLine(readline));//calling of pareseCSVLine method before adding to list.
			}

		} catch (FileNotFoundException e) {
			throw new DataResourcesNotFoundException("unable to finad data resource in class path", e);
		} catch (IOException e) {
			throw new DataReadException("problem is occuring during reading from source",e);
		}

		return list;
	}

	/**
	 * Defination of pareseCSVLine which takes input as String and return type is User type
	 * */
	private User pareseCSVLine(String readline) {
		if (readline == null) {
			return null;
		}
		String[] strarray = readline.split(SPLITDELEME);
		User user = new User();
		user.setUserId(strarray[0]);
		user.setUsername(strarray[1]);
		user.setEmial(strarray[2]);
		user.setPhoneNumber(strarray[3]);
		user.setCity(strarray[4]);
		return user;
	}

}
