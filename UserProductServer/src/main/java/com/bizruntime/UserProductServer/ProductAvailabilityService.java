package com.bizruntime.UserProductServer;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class ProductAvailabilityService {
	
	public static final  Logger LOGGER  = Logger.getLogger(ProductAvailabilityService.class);
	private List<Product> productList;
	private List<User> userList;
	public ProductAvailabilityService() throws FileReaderException, ResourceNotFoundException {
		productList = new ProductCSVReader().getAllProducts();
		userList = new UserCSVReader().getAllUsers();
		
	}
	
	public List<Product> getAllProductForUser(String userId) {
		if (userId == null) {
			return null;
		}
		LOGGER.info("LOGGA" + userId);

		String citynameofuser = null;
		List<Product> list = new ArrayList<>();
		for (User user : userList) {
			if (userId.equalsIgnoreCase(user.getUserId())) {
				citynameofuser = user.getCity();
				LOGGER.debug("user city" + citynameofuser);
			}
		}
		for (int index = 0; index < productList.size(); index++) {
			LOGGER.info(productList);
			for (int index1 = 0; index1 < productList.get(index).getAvailableCity().size(); index1++) {
				LOGGER.info(productList.get(index).getAvailableCity().get(index1));
				LOGGER.info(citynameofuser.equalsIgnoreCase(productList.get(index).getAvailableCity().get(index1)));
				if (citynameofuser.equalsIgnoreCase(productList.get(index).getAvailableCity().get(index1))) {
					list.add(productList.get(index));

					LOGGER.debug("Adding data to list for getAllProductforUser");
				}
			}
		}

		return list;
	}

	/**
	 * Defination of getAllProductforUserForCategory.which is taking input as
	 * userid and productcategory. and return type is List type whose generics
	 * is Product type.
	 */

	public List<Product> getAllProductForUserForCategory(String userId, String productCategory) {
		if (userId == null || productCategory == null) {
			return null;
		}
		List<Product> list = getAllProductForUser(userId);
		List<Product> listcategory = new ArrayList<>();
		LOGGER.debug("Getting list from getAllProductForUser");
		for (Product product : list) {
			if (productCategory.equalsIgnoreCase(product.getProductCategory())) {
				listcategory.add(product);
				LOGGER.debug("All data is added to list of getAllProductForUserForCategory");
			}
		}

		return listcategory;
	}

}
