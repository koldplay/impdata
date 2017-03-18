/**
 * This is class DBUserDAOImpl which is implementing IUserDAO interface.
 * This is class which is reading data from database and convert into list.
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
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;

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
		LOGGER.debug("getAllUser is start getting data from resources");
		String query = "select * from User";
		List<User> list = new ArrayList<>();
		
		LOGGER.debug("creating connection between database and user programe");
		try (Connection con = DBUTIL.getDBConnection()) {
			LOGGER.debug(con);
			try (PreparedStatement preparedStatement = con.prepareStatement(query);
					ResultSet resultSet = preparedStatement.executeQuery(query)){
				LOGGER.info(resultSet);
				while ( resultSet.next()) {
					list.add(parseDBResultSet(resultSet));
					LOGGER.info(list);
					//con.commit();
				}
			} catch (SQLException e) {
				//con.rollback();
				//con.setAutoCommit(true);
			//LOGGER.warn("unable to read data from data base");
			//throw new DataReadException("unable to read data from datam source", e);
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			//LOGGER.warn("unable to create connection to data base");
			//throw new DataReadException("probnlem is occuring while making connection", e);
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * Defination of parseDBResultSet which is taking input as resultset and returning user type.
	 * */
	private User parseDBResultSet(ResultSet resultSet) throws DataReadException {
		LOGGER.debug("parsing data from resultset to there datatype");
		if (resultSet == null) {
			return null;
		}
		User user = new User();
		LOGGER.debug("start data parsing");
		try {
			user.setUserId(resultSet.getString(1));
			LOGGER.info(user.getUserId());
			user.setUsername(resultSet.getString(2));
			user.setEmail(resultSet.getString(3));
			user.setPhoneNumber(resultSet.getString(4));
			user.setCity(resultSet.getString(5));
		} catch (SQLException e) {
			LOGGER.warn("unable to parsing ");
			throw new DataReadException("unable to set data to the object of user", e);			
		}
		LOGGER.info(user);
		return user;
	}
//	public void addDataToDb() throws DataReadException, DataResourcesNotFoundException{
//		String query = "insert into user values(?,?,?,?,?)";
//		//LOGGER.debug("Query"+query);
//		try (Connection con = DBUTIL.getDBConnection();//crating connection to database.
//				PreparedStatement preparedStatement = con.prepareStatement(query)) {
//				preparedStatement.setString(1, "U1111");
//				preparedStatement.setString(2, "Rohit");
//				preparedStatement.setString(3, "Rohit.r@bizruntime.com");
//				preparedStatement.setString(4, "9066884514");
//				preparedStatement.setString(5, "Bangalore");
//				preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			LOGGER.warn("unable to read data from data base");
//			throw new DataReadException("unable to read data from datam source", e);
//		}
//
//	}
//	public void updateDataToDb() throws DataReadException, DataResourcesNotFoundException{
//		String query = "update user set phoneNumber = ? where userId = ?";
//		//LOGGER.debug("Query"+query);
//		try (Connection con = DBUTIL.getDBConnection();	//crating connection to database.
//				PreparedStatement preparedStatement = con.prepareStatement(query)) {
//				preparedStatement.setString(1, "9999999999");
//				preparedStatement.setString(2, "U1005");
//				preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			LOGGER.warn("unable to read data from data base");
//			throw new DataReadException("unable to read data from datam source", e);
//		}
//
//	}
//	public void deleteDataToDb() throws DataReadException, DataResourcesNotFoundException{
//		String query = "DELETE FROM user WHERE userId = ?";
//		//LOGGER.debug("Query"+query);
//		try (Connection con = DBUTIL.getDBConnection();//crating connection to database.
//				PreparedStatement preparedStatement = con.prepareStatement(query)) {
//				preparedStatement.setString(1, "U1011");
//				preparedStatement.executeUpdate();
//		} catch (SQLException e) {
//			LOGGER.warn("unable to read data from data base");
//			throw new DataReadException("unable to read data from datam source", e);
//		}
//
//	}

//	@Override
//	public void addDataToDb() throws DataReadException, DataResourcesNotFoundException {
//		// TODO Auto-generated method stub
//		
//	}

}
