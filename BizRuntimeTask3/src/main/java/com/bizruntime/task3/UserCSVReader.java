/**
 * UserCSVReader is basically used for reading User.csv File.
 * @version 1.0
 * @since 11-02-2017
 * */

package com.bizruntime.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;

import org.apache.log4j.Logger;

public class UserCSVReader {
	
	/**
	 * Declartion and initialization of constant and objects
	 * 
	 * */
	public static final String CSVUSER_LOC="User.csv";
	final static Logger LOGGER = Logger.getLogger(UserCSVReader.class);
	/**
	 * getAllUser method is used for reading all data from user.csv. 
	 * this method return type is list type and generic class is User class type.
	 * for reading csv file through class path resources.
	 * throws two user defined exceptions
	 * @throws UserFileNotFoundException
	 * @throws UserIOException
	 * */
	
	public List<User> getAllUsers() throws UserFileNotFoundException ,UserIOException{
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVUSER_LOC);
		//Scanner scanner = new Scanner(inputStream);
		List<User> list = new ArrayList<User>();
		String strread = null;
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
			
			while ((strread = bufferedReader.readLine())!=null) {				
				strread = bufferedReader.readLine();
				list.add(parseUserCsv(strread));
			}
			
			
		} catch (FileNotFoundException e) {
			new UserFileNotFoundException("User.csv File Not Found in classpath", e);
		}catch (IOException e) {
			new UserIOException("Unable to read User.csv file", e);
		}
		
		return list;		
	}
	/**
	 * parseUserCSV method is for parsing String element to there respective datatype.
	 * return type is User class type. 
	 * */
	
	public User parseUserCsv(String strread) {
		String[] strsplit = strread.split(",");
		String userId = strsplit[0];
		String userName =strsplit[1];
		String email = strsplit [2];
		String phoneNumber = strsplit[3];
		String city = strsplit [4]; 
		return new User(userId,userName,email,phoneNumber,city);
	}
	
	
}
