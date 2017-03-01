/**
 * This is a interface IUserDAO. 
 * which is having decalaration of all methods.
 * which will implements in DBUserDAOImpl and CSVUserDAOImple.
 * 
 * version 1.0
 * since 17-02-2017 
 * */
package com.bizruntime.task3.task3dao;
/**
 * Declaration of imports and packages.
 * */
import java.util.List;
import com.bizruntime.task3.task3dao.exception.DataReadException;
import com.bizruntime.task3.task3dao.exception.DataResourcesNotFoundException;
import com.bizruntime.task3.task3dao.exception.ResourceNotMatchedException;
/**
 * Defination of IUserDAO Interface.
 * */
public interface IUserDAO {

	public List<User> getAllUsers() throws DataReadException, DataResourcesNotFoundException;
	void addDataToDb() throws DataReadException ,DataResourcesNotFoundException, ResourceNotMatchedException;
	public void updateDataToDb() throws DataReadException,DataResourcesNotFoundException,ResourceNotMatchedException ;
	public void deleteDataToDb() throws DataReadException,DataResourcesNotFoundException,ResourceNotMatchedException ;
}
