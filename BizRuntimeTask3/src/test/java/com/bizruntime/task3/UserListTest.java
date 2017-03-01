package com.bizruntime.task3;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

public class UserListTest {
	
	public static final Logger LOGGER = Logger.getLogger(UserListTest.class);
	@Test
	public void testGetAllUsers() throws UserFileNotFoundException, UserIOException{
		UserCSVReader user = new UserCSVReader();
		List<User> list = user.getAllUsers();
		LOGGER.info(list);
	}
	
	@Test
	public void testGetAllProducts(){
		ProductCSVReader product = new ProductCSVReader();
		List<Product> list = product.getAllProducts();
		LOGGER.info(list);
	}
	
	@Test
	public void testGetAllProductForUserForCategory() throws UserFileNotFoundException, UserIOException{
		ProductAvailabilityService product = new ProductAvailabilityService();
		LOGGER.info(product.getAllProductForUser("U1009"));
		LOGGER.info(product.getAllProductForUserForCategory("U1011", "Mobile"));
	}
	
}
