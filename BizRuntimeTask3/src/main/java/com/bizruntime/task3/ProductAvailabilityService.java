/**
 * This is class ProductAvailabilityService which is checking.
 * Whether product is availble or not into the list.
 * @version 1.0
 * @since 11-02-2017 	 	 
 * */

package com.bizruntime.task3;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class ProductAvailabilityService {
	
	/**
	 * Declartion and initialization of constant and objects.
	 * 
	 * */
	
	 private List<Product> productList;
	 private List<User> userList;
	 public static final Logger LOGGER = Logger.getLogger(ProductAvailabilityService.class); 
	 /**
	  * ProductAvailabilityService is default constructor which throws
	  * @throws UserFileNotFoundException
	  * @throws UserIOException 
	  * both are user defined exception
	  * */
	 public ProductAvailabilityService() throws UserFileNotFoundException, UserIOException {
		 userList = new UserCSVReader().getAllUsers();
		 productList = new ProductCSVReader().getAllProducts();
	}
	 
	 /**
	  * getAllProductForUser method is method which takes userid and gives product list about perticular user
	  * it's return type is Arraylist whose generics type is product type.
	  * 
	  * */
	 public List<Product> getAllProductForUser(String userId) throws UserFileNotFoundException, UserIOException{
		 List<Product> list = new ArrayList<Product>(); 
		 //LOGGER.info(userId);
		 String cityOfUser = null;
		 List<String> cityListProduct = null;		
		 userList = new UserCSVReader().getAllUsers();

		 
		 productList = new ProductCSVReader().getAllProducts();
		 Product pro = null ;
		 for (User user : userList) {
			 //LOGGER.info(user);
			 if (userId.equals(user.getUserId())) {
				LOGGER.info(userId);
				cityOfUser = user.getCity();
				for (Product product : productList) {
					//cityListProduct = product.getAvailableCity();
					//LOGGER.info(cityListProduct);
					for (int i = 0; i < productList.size(); i++) {
						for (int j = 0; j < productList.get(i).getAvailableCity().size(); j++) {
							if (cityOfUser.equals(productList.get(i).getAvailableCity().get(j))) {
								list.add(productList.get(i));
							}
						}
					}
				}	
			}			
		}
		return list;		 
	 }
	 /**
	  * getAllProductForUserForCategory method is method which takes userid and productcategory and gives product list about perticular user
	  * it's return type is Arraylist whose generics type is product type.
	  * 
	  * */
	 
	 public List<Product> getAllProductForUserForCategory(String userId,String productCategory) throws UserFileNotFoundException, UserIOException{
		 List<Product> listOfProductCategory = new ArrayList<>();
		 List<Product> list = getAllProductForUser(userId);
		 if (userId == null) {
			LOGGER.info("null");
		}
		for (int i = 0; i < list.size();i++) {
			if (((Product) list).getProductName() == productCategory) {
				listOfProductCategory.add(list.get(i));
			}
		}
		return listOfProductCategory;		 
	 }
}
