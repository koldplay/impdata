/**
 * This is class DBUserDAOImpl which is implementing IUserDAO interface.
 * This is class which is reading data from database and convert into list.
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
import java.util.List;
import org.apache.log4j.Logger;
import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;

/**
 * Defination of DBUserDAOImpl class. who is having method getAllUsers.
 * */

public class DBUserDAOImpl implements IUserDAO {

	/**
	 * Declaration of all the constant and class.	
	 * */
	public static final Logger LOGGER = Logger.getLogger(DBUserDAOImpl.class);
	public static final DBUtil DBUTIL = new DBUtil();

	public List<User> getAllUsers() throws DataReadException, DataResourcesNotFoundException {
		String query = "select * from User";
		List<User> list = new ArrayList<>();

		try (Connection con = DBUTIL.getDBConnection();//crating connection to database.
				PreparedStatement preparedStatement = con.prepareStatement(query);
				ResultSet resultSet = preparedStatement.executeQuery(query)) {

			while (resultSet.next()) {
				list.add(parseDBResultSet(resultSet));//calling to method which parse data according to datatype.
			}

		} catch (SQLException e) {
			throw new DataReadException("unable to read data from datam source", e);
		}
		return list;
	}

	/**
	 * Defination of parseDBResultSet which is taking input as resultset and returning user type.
	 * */
	private User parseDBResultSet(ResultSet resultSet) throws DataReadException {
		if (resultSet == null) {
			return null;
		}
		User user = new User();
		try {
			user.setUserId(resultSet.getString(1));
			user.setUsername(resultSet.getString(2));
			user.setEmial(resultSet.getString(3));
			user.setPhoneNumber(resultSet.getString(4));
			user.setCity(resultSet.getString(5));
		} catch (SQLException e) {
			throw new DataReadException("unable to set data to the object of user", e);			
		}
		return user;
	}

}
