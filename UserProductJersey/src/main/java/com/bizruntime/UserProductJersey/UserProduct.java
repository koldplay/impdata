
package com.bizruntime.UserProductJersey;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.glassfish.api.I18n;
import org.glassfish.config.support.Delete;

import com.bizruntime.UserProductRestEasy.DAOFactory;
import com.bizruntime.UserProductRestEasy.DAOFactoryImplementation;
import com.bizruntime.UserProductRestEasy.IProductDAO;
import com.bizruntime.UserProductRestEasy.IUserDAO;
import com.bizruntime.UserProductRestEasy.Product;
import com.bizruntime.UserProductRestEasy.User;
import com.bizruntime.exception.DataReadException;
import com.bizruntime.exception.DataResourcesNotFoundException;
import com.bizruntime.exception.ResourceNotMatchedException;
import com.bizruntime.resource.UserProductRest;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/userpoduct")
public class UserProduct {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
	public static final Logger LOGGER = Logger.getLogger(UserProductRest.class);
	DAOFactoryImplementation dao = new DAOFactoryImplementation();
	DAOFactory daofac = DAOFactory.getInstance();
	
	

	@GET
	public String gethello(){
		return "Hello world i am krishna";
	}
	
    @GET 
    @Produces("text/plain")
    public String getIt() {
        return "Hi there!";
    }
    
	@GET
	@Path("getUser")
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> readDataUser() throws DataReadException, DataResourcesNotFoundException, IOException, ResourceNotMatchedException{
		String dataprovide = dao.readprop();
		List<User> listUser = null;
		
		if (dataprovide.equalsIgnoreCase("database")) {
			IUserDAO user = daofac.getUserDAO(dataprovide);
			listUser = user.getAllUsers();
			//data insertion
			//user.addDataToDb();
			
		}else if(dataprovide.equalsIgnoreCase("csv")){
			LOGGER.info(dataprovide);
			IUserDAO user = daofac.getUserDAO(dataprovide);
			listUser = user.getAllUsers();
			LOGGER.info(listUser);
			
		}
		return listUser;
//		return Response.status(Status.OK).entity(listUser).build() ;
	
	}
	
	@GET
	@Path("getproduct")
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
	
	@POST
	@Path("addUser/user")
	@Produces({MediaType.APPLICATION_JSON ,MediaType.APPLICATION_XML} )
	@Consumes({MediaType.APPLICATION_JSON , MediaType.TEXT_HTML ,MediaType.APPLICATION_XML })
	public void addUser(User user) throws IOException,DataReadException, 
														   DataResourcesNotFoundException, 
														   ResourceNotMatchedException{
		String dataprovide = dao.readprop();
		
		LOGGER.info(user);
		LOGGER.info("message"+user.getUserId());
		IUserDAO userDao = daofac.getUserDAO(dataprovide);
		userDao.addDataToDb(user);
		
	}
	
	
	@PUT
	@Path("updateUser/user")
	@Consumes({MediaType.APPLICATION_JSON , MediaType.TEXT_HTML , MediaType.APPLICATION_XML })
	@Produces (MediaType.APPLICATION_JSON)
	public void updateUser(User user) throws IOException, 
											 DataReadException, 
											 DataResourcesNotFoundException, 
											 ResourceNotMatchedException{
		LOGGER.debug(user);
		if (user == null) {
			return ;
		}
		LOGGER.debug(user.getUserId());
		String dataprovide = dao.readprop();
		IUserDAO userDao = daofac.getUserDAO(dataprovide);
		userDao.updateDataToDb(user);
	}
	@DELETE
	@Path("/deleteUser/{userid}")
	public void deleteUser( @PathParam ("userid")String userId ) throws IOException, DataReadException, DataResourcesNotFoundException, ResourceNotMatchedException{
		if (userId == null ) {
			return;
		}
		LOGGER.info(userId + ":UserId");
		String dataprovide = dao.readprop();
		IUserDAO userDao = daofac.getUserDAO(dataprovide);
		userDao.deleteDataToDb(userId);
	}
	@DELETE
	@Path ("deleteProduct/{productid}")
	public Response deleteProduct(@PathParam ("productid") String productId ) throws IOException, DataReadException, DataResourcesNotFoundException{
		if (productId == null) {
			return null;
		}
		LOGGER.debug("Product Id :"+ productId);
		String dataprovide = dao.readprop();
		IProductDAO productDao = daofac.getProductDAO(dataprovide);
		productDao.deleteDataDb(productId);
		return Response.status(Status.NO_CONTENT).build();
	}
}
