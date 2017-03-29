/**
 * This is a interface IProductDAO. 
 * which is having decalaration of all methods.
 * which will implements in DBProductDAOImpl and CSVProductDAOImple.
 * 
 * version 1.0
 * since 17-02-2017 
 * */

package com.bizruntime.UserProductRestEasy;
import java.io.IOError;
import java.io.IOException;
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
	public void deleteDataDb(String productId) throws DataReadException, DataResourcesNotFoundException, IOException;
}
