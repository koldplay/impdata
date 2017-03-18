package com.bizruntime.mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable arg0) {
		ErrorMessage errorMessage = new ErrorMessage(arg0.getMessage(), 500, "www.userproduct.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).type(MediaType.TEXT_PLAIN).entity(errorMessage).build();
	}

}
