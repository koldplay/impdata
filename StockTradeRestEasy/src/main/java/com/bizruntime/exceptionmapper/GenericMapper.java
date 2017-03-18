package com.bizruntime.exceptionmapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericMapper implements ExceptionMapper<Throwable> {

	public Response toResponse(Throwable arg0) {
		ErrorMessage errorMessage = new ErrorMessage("Internal server Error", 500, "www.stocktrade.com");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}

}
