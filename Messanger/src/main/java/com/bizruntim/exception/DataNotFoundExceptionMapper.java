package com.bizruntim.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.sun.jersey.api.client.ClientResponse.Status;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException>{

	@Override
	public Response toResponse(DataNotFoundException arg0) {
		
		ErrorMessage error = new ErrorMessage(arg0.getMessage(),404,
				"https://www.youtube.com/watch?v=9oeJc_VkZxo&list=PLqq-6Pq4lTTZh5U8RbdXq0WaYvZBz2rbn&index=27");
		return Response.status(Status.NOT_FOUND).entity(error).build();
	}

}
