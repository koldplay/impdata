/**
 * This is a interface IProductDAO. 
 * which is having decalaration of all methods.
 * which will implements in DBProductDAOImpl and CSVProductDAOImple.
 * 
 * version 1.0
 * since 17-02-2017 
 * */

package com.bizruntime.UserProductRestEasy;
/**
 * Declaration of imports and packages.
 */
import java.util.List;
import com.bizruntime.exception.DataResourcesNotFoundException;
import com.bizruntime.exception.DataReadException;;
/**
 * Defination of IProductDAO Interface.
 * */
public interface IProductDAO {	

	public List<Product> getAllProducts() throws DataReadException, DataResourcesNotFoundException;
}
