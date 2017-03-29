/**
 * This is a interface IUserDAO. 
 * which is having decalaration of all methods.
 * which will implements in DBUserDAOImpl and CSVUserDAOImple.
 * 
 * version 1.0
 * since 17-02-2017 
 * */
package com.bizruntime.UserProductRestEasy;
/**
 * Declaration of imports and packages.
 * */
import java.util.List;
import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;
import com.bizruntime.exception.ResourceNotMatchedException;
/**
 * Defination of IUserDAO Interface.
 * */
public interface IUserDAO {

	public List<User> getAllUsers() throws DataReadException, DataResourcesNotFoundException;
	void addDataToDb(User userdata) throws DataReadException ,DataResourcesNotFoundException, ResourceNotMatchedException;
	public void updateDataToDb(User user) throws DataReadException,DataResourcesNotFoundException,ResourceNotMatchedException ;
	public void deleteDataToDb(String userID) throws DataReadException,DataResourcesNotFoundException,ResourceNotMatchedException ;
}
