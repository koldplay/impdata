package com.bizruntime.userproduct;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService(targetNamespace = "http://userproduct.bizruntime.com/", portName = "ProductAvailabilityServicePort", serviceName = "ProductAvailabilityServiceService")
public class ProductAvailabilityService {
	 private List<Product> productList;
	 private List<User> userList;
	 public static final Logger LOGGER = Logger.getLogger(ProductAvailabilityService.class); 
	 
	 public ProductAvailabilityService() throws ResourceNotFoundException, FileReaderException, ResourceNotFoundException_Exception {
		 userList = new UserCSVReader().getAllUsers();
		 productList = new ProductCSVReader().getAllProducts();
	}
	 public List<Product> getAllProductForUser(String userId) {
			if (userId == null) {
				return null;
			}
			LOGGER.info("LOGGA" + userId);

			String citynameofuser = null;
			List<Product> list = new ArrayList<Product>();
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

		public List<Product> getAllProductForUserForCategory(String userId, String productCategory) {
			if (userId == null || productCategory == null) {
				return null;
			}
			List<Product> list = getAllProductForUser(userId);
			List<Product> listcategory = new ArrayList<Product>();
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
