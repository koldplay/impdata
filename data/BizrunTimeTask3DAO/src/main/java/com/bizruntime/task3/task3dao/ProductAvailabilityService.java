/**
 * This is class ProductAvailabilityService which is having method .
 * getAllProductForUser method will be used to produce those productcategory for specified user.
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;

/**
 * Declaration of imports and packages.
 * */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;

/**
 * defination of ProductAvailablitiyService class.
 * these class is having 2 methdos and one constructor.
 * constructor is having initialization of all product list and user list .
 * and remaining methods will process on the list. 
 * */
public class ProductAvailabilityService {
	
/**
 * Declaration of constant and List.
 * */	
	
	 public static final Logger LOGGER = Logger.getLogger(ProductAvailabilityService.class);
	 private List<Product> productList;
	 private List<User> userList;
/**
 * Defination of productAvailableService constructor.
 * */	 
	 public ProductAvailabilityService() throws DataReadException, DataResourcesNotFoundException {
		productList = new CSVProductImpl().getAllProducts();
		userList = new CSVUserDAOImpl().getAllUsers();
	}
/**
 * Defination of getAllProductForUser.which is taking input as specied username.
 * and returntype is List Type whose generics is Product type.
 * */	 
	 public List<Product> getAllProductForUser(String userId){
		 if (userId == null) {
			return null;
		}
		 String citynameofuser = null;
		 List<Product> list = new ArrayList<>();
		 for (User user : userList) {
			 if (userId.equalsIgnoreCase(user.getUserId())) {
				citynameofuser = user.getCity();
				LOGGER.debug(user.getCity());
			}
		}
		 for (int index = 0; index < productList.size(); index++) {
			for (int index1 = 0; index1 < productList.get(index).getAvailableCity().size(); index1++) {
				if (citynameofuser.equalsIgnoreCase(productList.get(index).getAvailableCity().get(index1))) {
					LOGGER.debug(productList.get(index));
					list.add(productList.get(index));
							
				}
			}
		}
		 return list;
	 }
/**
 * Defination of getAllProductforUserForCategory.which is taking input as userid and productcategory.
 * and return type is List type  whose generics is Product type.
 * */	 
	 
	 public List<Product> getAllProductForUserForCategory(String userId,String productCategory){
		 if (userId == null || productCategory == null) {
			return null;
		}	
		 List<Product> list = getAllProductForUser(userId);
		 List<Product> listcategory = new ArrayList<>();
		 
		 for (Product product : list) {
			if (productCategory.equalsIgnoreCase(product.getProductCategory())) {
				listcategory.add(product);
			}
		}
		 
		 return listcategory; 
	 }
}
