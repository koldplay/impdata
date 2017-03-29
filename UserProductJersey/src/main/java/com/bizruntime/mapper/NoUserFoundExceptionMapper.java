package com.bizruntime.mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bizruntime.exception.NoUserFoundException;
@Provider
public class NoUserFoundExceptionMapper implements ExceptionMapper<NoUserFoundException> {

	@Override
	public Response toResponse(NoUserFoundException arg0) {
		ErrorMessage errorMessage = new ErrorMessage(arg0.getMessage(), 400, "www.userproduct.com");
		return Response.status(Status.BAD_REQUEST).type(MediaType.TEXT_PLAIN).entity(errorMessage).build();
	}
	
}
