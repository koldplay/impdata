package com.bizruntime.taskondao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.bizruntime.exception.CSVReaderClassCastException;
import com.bizruntime.exception.StockTradeIOException;

public class DBUtil {
	private static String driverCLassName;
	private static String url;
	private static String username ;
	private static String password;
	public static final String FILE_LOC = "connection.properties";
	public static final Logger LOGGER = Logger.getLogger(DBUtil.class);
	public Connection getDBUTIL() throws SQLException, StockTradeIOException, CSVReaderClassCastException{
		Properties properties = new Properties();
		InputStream inStream ;
		Connection con = null ;
		
		inStream = getClass().getClassLoader().getResourceAsStream(FILE_LOC);
		if (inStream == null) {
			return null;
		}else {
			try {
				properties.load(inStream);
				driverCLassName = properties.getProperty("driverClassName");
				url = properties.getProperty("url");
				username = properties.getProperty("username");
				password = properties.getProperty("password");
				Class.forName(driverCLassName);
				con = DriverManager.getConnection(url, username, password);
			} catch (IOException e) {
				throw new StockTradeIOException("unable to read connection.properties file", e);
			} catch (ClassNotFoundException e) {				
				throw new CSVReaderClassCastException("unable to cast to driverClass", e);
			}
			
		}	
		LOGGER.info(driverCLassName);
		
		
		return con;
	}
}
