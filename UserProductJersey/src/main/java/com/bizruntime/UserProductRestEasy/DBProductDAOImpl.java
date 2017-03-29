/**
 * This is class DBProductDAOImpl which is having implementation with Database.
 * this class which is implement IProductDAO interface.
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.UserProductRestEasy;
/**
 * Declaration of all imports and packages.
 * */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;

/**
 * Defination of DBProductDAOImpl.which is having method getAllProducts form database.
 * */
public class DBProductDAOImpl implements IProductDAO{

	/**
	 * Declaration of all constants and class.
	 * */
	public static final Logger LOGGER = Logger.getLogger(DBProductDAOImpl.class);
	public static final DBUtil DBUTIL = new DBUtil();//creating connection to database.all operation in DBUtilc class. 
	
	/**
	 * Defination of  getAllProducts Method.Method will do it will read data from data base.and store into list which is Product Generics type .
	 * */
	public List<Product> getAllProducts() throws DataReadException, DataResourcesNotFoundException {
		LOGGER.debug("getAllProduct is start getting data from resources");
		String query = "SELECT product.productId,"
						+ "product.productName,"
						+ "product.productCategory,"
						+ "product.price,"
						+ "GROUP_CONCAT(availablecity.city) FROM "
															+ "product INNER JOIN availablecity WHERE "
															+ "product.productId = availablecity.productId "
															+ "GROUP BY availablecity.productId";
		List<Product> list = new ArrayList<>();
		Savepoint savepoint1 = null;
		LOGGER.debug("creating connection between database and user programe");
		try (Connection con = DBUTIL.getDBConnection();) {
			try (PreparedStatement preparedStatement = con.prepareStatement(query);
				 ResultSet resultSet = preparedStatement.executeQuery(query)		){
				while (resultSet.next()) {
					LOGGER.debug("Start data adding to list");
					list.add(parseResultSetLine(resultSet));//here adding to list
				}
//				con.commit();
//				savepoint1 = con.setSavepoint();
			} catch (SQLException e) {
//				con.rollback(savepoint1);
				//con.setAutoCommit(true);
				LOGGER.warn("unable to read data from database");
				throw new DataReadException("problem occuring during reading",e);
			}		
			
		} catch (SQLException e) {			
			LOGGER.warn("unable to make connection to data base");
			throw new DataResourcesNotFoundException("problem is occuring to making connection from database",e);
		}
		return list;
	}
	/**
	 * Defination of parseResultSetLine method which takes input as resultset
	 * and parse data according to there datatype.return type is Product type.
	 * */
	private Product parseResultSetLine(ResultSet resultSet) throws DataReadException{
		
		LOGGER.debug("parsing data from resultset to there datatype");
		Product product = new Product();
		if (resultSet == null) {
			return null;
		}else {
			LOGGER.debug("start data parsing");
			try {
				product.setProductId(resultSet.getString(1));
				product.setProductName(resultSet.getString(2));
				product.setProductCategory(resultSet.getString(3));
				product.setPrice(Double.parseDouble(resultSet.getString(4)));
				String[] cityList = resultSet.getString(5).split(",");
				List<String> list = new ArrayList<>();
				for (int i = 0; i < cityList.length; i++) {
					list.add(cityList[i]);
					LOGGER.info(list);
				}
				product.setAvailableCity(list);
			} catch (SQLException e) {
				LOGGER.warn("unable to parsing ");
				throw new DataReadException("unable to set data to the object of product",e);
			}

		}
		return product;
	}
	public void deleteDataDb(String productId) throws DataReadException, DataResourcesNotFoundException {
		String query = "DELETE FROM ? WHERE "
				+ "product.productId = ?";
		try (Connection con = DBUTIL.getDBConnection();
			 PreparedStatement preparedStatement = con.prepareStatement(query)){
			preparedStatement.setString(1, "'product'");
			preparedStatement.setString(2, productId);
			preparedStatement.executeUpdate();
			preparedStatement.setString(1, "'availablecity'");
			preparedStatement.setString(2, productId);
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.warn("unable to read data from data base");
			throw new DataReadException("unable to read data from data source", e);
		}
	}

}
