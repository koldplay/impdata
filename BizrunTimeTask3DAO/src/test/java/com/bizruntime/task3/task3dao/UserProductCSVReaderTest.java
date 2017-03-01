/**
 * This is junit test class which is used for unit testing of Factory class of DAOproject.
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;

/**
 * declaration of all the packages and imports.
 * */
import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;

import org.junit.Test;

import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;
/**
 * Defination of UserProductCSVReaderTest class.
 * which is having two methods testFactoryImplemantation and 
 * testGetAllProductsForUser.which impliments DAOFactoryImplementation class object creation and 
 * ProductAvailabilityService class method calling.  
 * */

public class UserProductCSVReaderTest {
	
	/**
	 * Declaration of all constant.
	 * */
	public static final Logger LOGGER = Logger.getLogger(UserProductCSVReaderTest.class);
	
	/**
	 * Defination of testFactoryImplimentation.
	 * */
	@Test 
	public void testFactoryImplimentation() throws DataReadException, DataResourcesNotFoundException{		
		DAOFactoryImplementation factoryImplementation = new DAOFactoryImplementation();
		factoryImplementation.readPropertiesFile();
	}
	
	/**
	 * Defination of testGetAllProductForUser.
	 * */
//	@Test
//	public void testGetAllProductForUser() throws DataReadException, DataResourcesNotFoundException{
//		ProductAvailabilityService availabilityService = new ProductAvailabilityService();
//		@SuppressWarnings({ "unused" })
//		//List<Product> list = availabilityService.getAllProductForUser("U1001");
//		List<Product> list = availabilityService.getAllProductForUserForProductcategoryDB();
//		LOGGER.debug("datafromlist"+list);
////		LOGGER.debug("getting data for specified user");
////		@SuppressWarnings("unused")
////		List<Product> list1 = availabilityService.getAllProductForUserForCategory("U1001", "Mobile");
////		LOGGER.debug("Getting data for specifed user and productcategory");
////		assertEquals("[(Pro001,MotoxPlay,Mobile,20000.0,[Pune, Bangalore, Delhi, Mumbai]), (Pro002,OnePlusOne,Mobile,15000.0,[Bangalore, Delhi]), (Pro004,iPhone4s,Mobile,30000.0,[Pune, Bangalore, Delhi]), (Pro007,MotoG,Mobile,15000.0,[Pune, Bangalore, Delhi, Mumbai]), (Pro010,HP Gratitude,Laptop,210000.0,[Bangalore, Delhi]), (Pro011,AppleMacPro,Laptop,120000.0,[Pune, Bangalore, Delhi, Mumbai, Chennai]), (Pro013,LG Washing MC,WashingMachin,30000.0,[Pune, Bangalore, Delhi, Mumbai, Chennai])]",availabilityService.getAllProductForUser("U1001").toString());
////		LOGGER.debug("Test case will be passed for getAllProductForUser method");
////		assertEquals("[(Pro001,MotoxPlay,Mobile,20000.0,[Pune, Bangalore, Delhi, Mumbai]), (Pro002,OnePlusOne,Mobile,15000.0,[Bangalore, Delhi]), (Pro004,iPhone4s,Mobile,30000.0,[Pune, Bangalore, Delhi]), (Pro007,MotoG,Mobile,15000.0,[Pune, Bangalore, Delhi, Mumbai])]", availabilityService.getAllProductForUserForCategory("U1001", "Mobile").toString());
////		LOGGER.debug("Test case will be passed for getAllProductForUserForCategory method");
//	}
		
	
	
}
