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
import org.apache.log4j.Logger;
import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;

/**
 * Defination of DAOFactoryImplementation class.
 */
public class DAOFactoryImplementation {

	public static final Logger LOGGER = Logger.getLogger(DAOFactoryImplementation.class);
	/**
	 * Defination of readPropertiesFile Method which
	 * 
	 * @throws DataReadException
	 * @throws DataResourcesNotFoundException
	 */

	public static final String FILE_LOC = "enviroment.properties";
	Properties properties = new Properties();
	String dataprovide = null;

	public void readPropertiesFile() throws DataReadException, DataResourcesNotFoundException {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_LOC);
		if (inputStream == null) {
			return;
		} else {
			try {

				properties.load(inputStream);
				dataprovide = properties.getProperty("datatype");
				DAOFactory daoFactory = DAOFactory.getInstance();

				switch (dataprovide) {
				case "csv":
					IUserDAO usercsvread = daoFactory.getUserDAO(dataprovide);
					LOGGER.info(usercsvread);
					List<User> listcsvreaduser = usercsvread.getAllUsers();
					LOGGER.debug("Reading from CSV File" + listcsvreaduser);

					IProductDAO productcsvread = daoFactory.getProductDAO(dataprovide);
					List<Product> listcsvreadprod = productcsvread.getAllProducts();
					LOGGER.debug("Reading from CSV File" + listcsvreadprod);

					ProductAvailabilityService availService = new ProductAvailabilityService();
					List<Product> listofuser = availService.getAllProductForUserDB();
					List<Product> listofcategory = availService.getAllProductForUserForProductcategoryDB();
					LOGGER.info("Data of Specified User"+listofuser);
					LOGGER.info("Data of Specifed user in specified category"+listofcategory);
					
					break;
				case "database":

					IProductDAO productdbread = daoFactory.getProductDAO(dataprovide);
					List<Product> listdbreadprod = productdbread.getAllProducts();
					LOGGER.debug("Reading form Database" + listdbreadprod);

					IUserDAO userdbread = daoFactory.getUserDAO(dataprovide);
					List<User> listdbread = userdbread.getAllUsers();
					LOGGER.debug("Reading from Database" + listdbread);
					
					
					ProductAvailabilityService availabilityService = new ProductAvailabilityService();
					List<Product> listofuserdb = availabilityService.getAllProductForUserDB();
					List<Product> listofcategorydb = availabilityService.getAllProductForUserForProductcategoryDB();
					LOGGER.info("Data of Specified User from DB"+listofuserdb);
					LOGGER.info("Data of Specifed user in specified category from DB"+listofcategorydb);
//					userdbread.addDataToDb();
//					LOGGER.info("New Data is Added to User Table");
//					userdbread.updateDataToDb();
//					LOGGER.info("Row is Updated in Table User");
//					userdbread.deleteDataToDb();
//					LOGGER.info("Row is deleted from table User");
					break;
				default:
					break;
				}

			} catch (IOException e) {
				throw new DataReadException("unable to read Enviornment.properties file", e);
			}
		}

	}

}
