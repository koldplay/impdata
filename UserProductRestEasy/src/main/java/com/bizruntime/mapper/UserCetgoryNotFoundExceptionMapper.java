package com.bizruntime.mapper;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bizruntime.exception.UserCetgoryNotFoundException;
@Provider
public class UserCetgoryNotFoundExceptionMapper implements ExceptionMapper<UserCetgoryNotFoundException>{

	@Override
	@Produces(MediaType.TEXT_PLAIN)
	public Response toResponse(UserCetgoryNotFoundException arg0) {
		ErrorMessage errorMessage = new ErrorMessage(arg0.getMessage(), 400, "www.userproduct.com");
		return Response.status(Status.BAD_REQUEST).entity(errorMessage.getErrormsg()).build();
	}
	
}
