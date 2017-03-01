/**
 * This is class DAOFactoryImplementation which is caller of DAOFactory class.
 * it is class who have defination of FactoryImplimentation method.
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;

import java.io.IOException;
import java.io.InputStream;
/**
 * declaration of all the imports and packages.
 * */
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.apache.log4j.Logger;
import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;

/**
 * Defination of DAOFactoryImplementation class.
 * */
public class DAOFactoryImplementation {

	public static final Logger LOGGER = Logger.getLogger(DAOFactoryImplementation.class);
	/**
	 * Defination of FactoryImplimentation Method which 
	 * @throws DataReadException 
	 * @throws DataResourcesNotFoundException
	 * */
	
	public static final String FILE_LOC = "Enviroment.properties"; 
	Properties properties = new Properties();
	String dataprovide = null;
	public void readPropertiesFile() throws DataReadException{
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_LOC);
		if (inputStream == null) {
			return;
		}else {
			try {				
				properties.load(inputStream);
				dataprovide = properties.getProperty("datatype");
			} catch (IOException e) {
				throw new DataReadException("unable to read Enviornment.properties file", e);
			}
		}
			
	}
	
	public void FactoryImplimentation() throws DataReadException, DataResourcesNotFoundException{
	DAOFactory daoFactory = new DAOFactory();
		
	
	
		IUserDAO usercsvread = daoFactory.getUserDAO(dataprovide);
		List<User> listcsvreaduser = usercsvread.getAllUsers();
		LOGGER.debug("Reading from CSV File"+listcsvreaduser);
		
		IProductDAO productcsvread = daoFactory.getProductDAO(dataprovide);
		List<Product> listcsvreadprod = productcsvread.getAllProducts();
		LOGGER.debug("Reading from csv File"+listcsvreadprod);
		
		
		IUserDAO userdbread = daoFactory.getUserDAO(dataprovide);
		List<User> listdbread = userdbread.getAllUsers();
		LOGGER.debug("Reading From DataBase"+listdbread);
		
		IProductDAO productdbread = daoFactory.getProductDAO(dataprovide);
		List<Product> listdbreadprod = productdbread.getAllProducts();
		LOGGER.debug("Reading form db file"+listdbreadprod);
		
	

	
	}
}
