/**
 * This is class DBUtil which is used for crating connection to database.
 * and through connection.properties file.
 * 
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;
/**
 * declaration of all packages and imports.
 * */
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.log4j.Logger;
import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;

/**
 * Defination of DBUtil class.
 * */
public class DBUtil {
	/**
	 * Declaration of all the constants.
	 * */
	public static final String FILE_LOC = "connection.properties";
	public static final Logger LOGGER = Logger.getLogger(DBUtil.class);

	/**
	 * Defination of getDBConnection whose return type is Connection Interface type.
	 * */
	
	public Connection getDBConnection() throws DataReadException, DataResourcesNotFoundException {
		/**
		 * declartion and initialization of all instances.
		 * */
		
		Properties properties = new Properties();
		InputStream inputStream;
		Connection con = null;

		inputStream = getClass().getClassLoader().getResourceAsStream(FILE_LOC);//reading file from classpath.
		if (inputStream == null) {
			return null;
		} else {
			try {

				BasicDataSource dataSource = new BasicDataSource();//initialization to basicdataresources

				properties.load(inputStream);

				dataSource.setDriverClassName(properties.getProperty("driverClassName"));
				dataSource.setUrl(properties.getProperty("url"));
				dataSource.setUsername(properties.getProperty("username"));
				dataSource.setPassword(properties.getProperty("password"));
				dataSource.setMinIdle(5);//minimum idle connection is active are is 5
				dataSource.setMaxIdle(10);//maximum idle connection is active are is 10
				dataSource.setMaxOpenPreparedStatements(100);//maximum idle prepared statement is active are is 100

				con = dataSource.getConnection();
			} catch (IOException e) {
				throw new DataReadException("unable to read connection.properties file", e);
			} catch (SQLException e) {
				throw new DataResourcesNotFoundException("unable to make connection to database");
			}
		}

		return con;
	}
}
