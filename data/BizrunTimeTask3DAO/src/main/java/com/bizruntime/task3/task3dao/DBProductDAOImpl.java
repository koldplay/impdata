/**
 * This is class DBProductDAOImpl which is having implementation with Database.
 * this class which is implement IProductDAO interface.
 * 
 * version 1.0
 * since 17-02-2017
 * */

package com.bizruntime.task3.task3dao;
/**
 * Declaration of all imports and packages.
 * */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;
import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;

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
		String query = "SELECT product.productId, product.productName, product.productCategory, product.price,availablecity.city FROM product INNER JOIN availablecity WHERE product.productId = availablecity.productId;";
		List<Product> list = new ArrayList<>();
		
		try (Connection con = DBUTIL.getDBConnection();
			 PreparedStatement preparedStatement = con.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery(query)	) {
			
			while (resultSet.next()) {
				list.add(parseResultSetLine(resultSet));//here adding to list
			}
			
		} catch (SQLException e) {
			throw new DataReadException("problem is occuring during reading from source",e);
		}
		return list;
	}
	/**
	 * Defination of parseResultSetLine method which takes input as resultset
	 * and parse data according to there datatype.return type is Product type.
	 * */
	private Product parseResultSetLine(ResultSet resultSet) throws DataReadException{
		Product product = new Product();
		if (resultSet == null) {
			return null;
		}else {
			
			try {
				product.setProductId(resultSet.getString(1));
				product.setProductName(resultSet.getString(2));
				product.setProductCategory(resultSet.getString(3));
				product.setPrice(Double.parseDouble(resultSet.getString(4)));
				List<String> list = Arrays.asList(resultSet.getString(5));
				product.setAvailableCity(list);
			} catch (SQLException e) {
				throw new DataReadException("unable to set data to the object of product",e);
			}

		}
		return product;
	}

}
