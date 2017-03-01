package com.bizruntime.task3.task3dao;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;

import org.junit.Test;

import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;

public class UserCSVReaderTest {
	
	public static final Logger LOGGER = Logger.getLogger(UserCSVReaderTest.class);
	
	@Test 
	public void testFactoryImplimentation() throws DataReadException, DataResourcesNotFoundException{		
		DAOFactoryImplementation factoryImplementation = new DAOFactoryImplementation();
		factoryImplementation.FactoryImplimentation();
	}
	
	@Test
	public void testGetAllProductForUser() throws DataReadException, DataResourcesNotFoundException{
		ProductAvailabilityService availabilityService = new ProductAvailabilityService();
		@SuppressWarnings({ "unused" })
		List<Product> list = availabilityService.getAllProductForUser("U1001");
		@SuppressWarnings("unused")
		List<Product> list1 = availabilityService.getAllProductForUserForCategory("U1001", "Mobile");
		assertEquals("[(Pro001,MotoxPlay,Mobile,20000.0,[Pune, Bangalore, Delhi, Mumbai]), (Pro002,OnePlusOne,Mobile,15000.0,[Bangalore, Delhi]), (Pro004,iPhone4s,Mobile,30000.0,[Pune, Bangalore, Delhi]), (Pro007,MotoG,Mobile,15000.0,[Pune, Bangalore, Delhi, Mumbai]), (Pro010,HP Gratitude,Laptop,210000.0,[Bangalore, Delhi]), (Pro011,AppleMacPro,Laptop,120000.0,[Pune, Bangalore, Delhi, Mumbai, Chennai]), (Pro013,LG Washing MC,WashingMachin,30000.0,[Pune, Bangalore, Delhi, Mumbai, Chennai])]",availabilityService.getAllProductForUser("U1001").toString());
		assertEquals("[(Pro001,MotoxPlay,Mobile,20000.0,[Pune, Bangalore, Delhi, Mumbai]), (Pro002,OnePlusOne,Mobile,15000.0,[Bangalore, Delhi]), (Pro004,iPhone4s,Mobile,30000.0,[Pune, Bangalore, Delhi]), (Pro007,MotoG,Mobile,15000.0,[Pune, Bangalore, Delhi, Mumbai])]", availabilityService.getAllProductForUserForCategory("U1001", "Mobile").toString());
	}

	
	
	
}
