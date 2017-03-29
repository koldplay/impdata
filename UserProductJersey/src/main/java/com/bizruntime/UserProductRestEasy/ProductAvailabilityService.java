/**
 * This is class ProductAvailabilityService which is having method .
 * getAllProductForUser method will be used to produce those productcategory for specified user.
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.UserProductRestEasy;
/**
 * Declaration of imports and packages.
 * */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.apache.log4j.Logger;
import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;

/**
 * defination of ProductAvailablitiyService class. these class is having 2
 * methdos and one constructor. constructor is having initialization of all
 * product list and user list . and remaining methods will process on the list.
 */
public class ProductAvailabilityService {

	/**
	 * Declaration of constant and List.
	 */

	public static final String FILE_LOC = "enviroment.properties";
	public static final Logger LOGGER = Logger.getLogger(ProductAvailabilityService.class);
	private List<Product> productList;
	private List<User> userList;
	Properties properties = new Properties();
	String dataprovide = null;
	DAOFactory factory = null;

	/**
	 * Defination of productAvailableService constructor.
	 */
	public ProductAvailabilityService() throws DataReadException, DataResourcesNotFoundException {
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_LOC);
		try {
			properties.load(inputStream);
			dataprovide = properties.getProperty("datatype");
			factory = DAOFactory.getInstance();
		} catch (FileNotFoundException e) {
			throw new DataResourcesNotFoundException();
		} catch (IOException e) {
			throw new DataReadException();
		}

		IUserDAO userDAO = factory.getUserDAO(dataprovide);
		IProductDAO dIProductDAO = factory.getProductDAO(dataprovide);

		productList = dIProductDAO.getAllProducts();
		userList = userDAO.getAllUsers();
	}

	/**
	 * Defination of getAllProductForUser.which is taking input as specied
	 * username. and returntype is List Type whose generics is Product type.
	 */
	public List<Product> getAllProductForUser(String userId) {
		if (userId == null) {
			return null;
		}
	
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

//	public List<Product> getAllProductForUserDB() throws DataReadException, DataResourcesNotFoundException {
//		List<Product> list = new ArrayList<>();
//		DBUtil dbUtil = new DBUtil();
//		String query = "SELECT product.productId,product.productName, product.productCategory, product.price, city.avilablecity FROM product INNER JOIN (productavilcity INNER JOIN city ON productavilcity.id = city.id) ON productavilcity.productId = product.productId AND city.avilablecity = (SELECT user.city FROM user WHERE user.userId = 'U1001');";
//		try (Connection con = dbUtil.getDBConnection();
//				PreparedStatement statement = con.prepareStatement(query);
//				ResultSet resultSet = statement.executeQuery(query)) {
//			while (resultSet.next()) {
//				list.add(parseResultSet(resultSet));
//			}
//		} catch (SQLException e) {
//			// TODO: handle exception
//		}
//		return list;
//	}
//
//	public List<Product> getAllProductForUserForProductcategoryDB()
//			throws DataReadException, DataResourcesNotFoundException {
//		List<Product> list = new ArrayList<>();
//		DBUtil dbUtil = new DBUtil();
//		String quString = "SELECT product.productId,product.productName,product.productCategory,product.price,city.avilablecity FROM product INNER JOIN (productavilcity INNER JOIN city ON productavilcity.id = city.id) ON productavilcity.productId = product.productId AND city.avilablecity = (SELECT user.city FROM user WHERE user.userId = 'U1001' AND product.productCategory = 'Mobile');";
//		try (Connection connection = dbUtil.getDBConnection();
//				PreparedStatement preparedStatement = connection.prepareStatement(quString);
//				ResultSet resultSet = preparedStatement.executeQuery(quString)) {
//			while (resultSet.next()) {
//				list.add(parseResultSet(resultSet));
//			}
//
//		} catch (SQLException e) {
//			
//		}
//		return list;
//	}
//
//	private Product parseResultSet(ResultSet resultSet) throws SQLException {
//		if (resultSet == null) {
//			return null;
//		}
//		Product product = new Product();
//		product.setProductId(resultSet.getString(1));
//		product.setProductName(resultSet.getString(2));
//		product.setProductCategory(resultSet.getString(3));
//		product.setPrice(Double.parseDouble(resultSet.getString(4)));
//		List<String> citylist = Arrays.asList(resultSet.getString(5));
//		product.setAvailableCity(citylist);
//		return product;
//	}

}
