package com.bizruntime.resource;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;
import com.bizruntime.UserProductRestEasy.DAOFactory;
import com.bizruntime.UserProductRestEasy.DAOFactoryImplementation;
import com.bizruntime.UserProductRestEasy.IProductDAO;
import com.bizruntime.UserProductRestEasy.IUserDAO;
import com.bizruntime.UserProductRestEasy.Product;
import com.bizruntime.UserProductRestEasy.ProductAvailabilityService;
import com.bizruntime.UserProductRestEasy.User;
import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;
import com.bizruntime.exception.NoUserFoundException;
import com.bizruntime.exception.UserCetgoryNotFoundException;

@Path("/UserProduct")
public class UserProductRest {
	
	public static final Logger LOGGER = Logger.getLogger(UserProductRest.class);
	DAOFactoryImplementation dao = new DAOFactoryImplementation();
	DAOFactory daofac = DAOFactory.getInstance();
	
	@GET
	public String gethello(){
		return "Hello world";
	}
	
	
	@GET
	@Path("/getUser")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> readDataUser() throws DataReadException, DataResourcesNotFoundException, IOException{
		String dataprovide = dao.readprop();
		List<User> listUser = null;
		
		if (dataprovide.equalsIgnoreCase("database")) {
			IUserDAO user = daofac.getUserDAO(dataprovide);
			listUser = user.getAllUsers();
			
			
		}else if(dataprovide.equalsIgnoreCase("csv")){
			LOGGER.info(dataprovide);
			IUserDAO user = daofac.getUserDAO(dataprovide);
			listUser = user.getAllUsers();
			LOGGER.info(listUser);
			
		}
		return listUser;
	
	}
	
	
	@GET
	@Path("/getproduct")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> readDataProduct() throws DataReadException, DataResourcesNotFoundException, IOException{
		String dataprovide = dao.readprop();
		List<Product> listProduct = null;
		
		if (dataprovide.equalsIgnoreCase("database")) {
			IProductDAO product = daofac.getProductDAO(dataprovide);
			listProduct = product.getAllProducts();
			
		}else if(dataprovide.equalsIgnoreCase("csv")){
			LOGGER.info(dataprovide);
			IProductDAO product = daofac.getProductDAO(dataprovide);
			listProduct = product.getAllProducts();
		
		}
		return listProduct;
	}
	
	@GET
	@Path("availdatauser/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAvailableData(@PathParam ("userId")String userid) throws DataReadException, DataResourcesNotFoundException, NoUserFoundException, IOException{
		String userId = "U1001";
		List<Product> listtogetuser  = null;
		ProductAvailabilityService proavail = new ProductAvailabilityService();
		UserProductRest rest = new UserProductRest();
		List<User> user = rest.readDataUser();
		for (User user2 : user) {
			LOGGER.info("Data of user"+user2.getUserId());
		}
		
		
		if (userId.equalsIgnoreCase(userid)) {
			listtogetuser = proavail.getAllProductForUser(userid);
		}else {
			throw new NoUserFoundException("Mention user is not found in list");
		}
		return listtogetuser;
	}
	@GET
	@Path("availdatausercategory/{userId}/{category}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAvailableDatausercategory(@PathParam ("userId") String userid,
			@PathParam("category") String categoryName) throws DataReadException, DataResourcesNotFoundException,
			UserCetgoryNotFoundException, NoUserFoundException{
		List<Product> listtogetusercategory  = null;
		String userId = "U1001";
		String categoryname = "Mobile";
		
		LOGGER.debug(userId);
		LOGGER.debug(categoryName);
		
		ProductAvailabilityService proavail = new ProductAvailabilityService();
		if (userId.equalsIgnoreCase(userid)) {
			if (categoryname.equalsIgnoreCase(categoryName)) {
				listtogetusercategory = proavail.getAllProductForUserForCategory(userId,categoryname);
			}else {
				throw new UserCetgoryNotFoundException("userId or may be categoryname is not matching");
			}			
		}else {
			throw new NoUserFoundException("Mention user is not found in list");
			
		}
		
		return listtogetusercategory;
	}
}
