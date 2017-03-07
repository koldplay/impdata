package com.bizruntime.UserProductAvailableService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class UserCSVReader {

	public static final String CSVUSER_LOC="User.csv";
	final static Logger LOGGER = Logger.getLogger(UserCSVReader.class);
	
	public List<User> getAllUsers() throws FileReaderException ,ResourceNotFoundException{
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(CSVUSER_LOC);
		//Scanner scanner = new Scanner(inputStream);
		List<User> list = new ArrayList<User>();
		String strread = null;
		try{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			while ((strread = bufferedReader.readLine())!=null) {				
				strread = bufferedReader.readLine();
				list.add(parseUserCsv(strread));
			}
			
			
		} catch (FileNotFoundException e) {
			new ResourceNotFoundException("User.csv File Not Found in classpath", e);
		}catch (IOException e) {
			new FileReaderException("Unable to read User.csv file", e);
		}
		
		return list;		
	}
	
	
	public User parseUserCsv(String strread) {
		String[] strsplit = strread.split(",");
		User user = new User();
		user.setUserId(strsplit[0]);
		user.setUsername(strsplit[1]);
		user.setEmail(strsplit[2]);
		user.setPhoneNumber(strsplit[3]);
		user.setCity(strsplit[4]);
		return user;
	}
}
