package com.bizruntime.mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bizruntime.exception.DataReadException;
@Provider
public class DataReadExceptionMapper  implements ExceptionMapper<DataReadException>{

	@Override
	public Response toResponse(DataReadException arg0) {
		ErrorMessage errorMessage = new ErrorMessage(arg0.getMessage(), 204, "www.userproduct.com");
		return Response.status(Status.NO_CONTENT).type(MediaType.TEXT_PLAIN).entity(errorMessage).build();
	}

}
