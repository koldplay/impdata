package com.bizruntime.mapper;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.bizruntime.exception.DataResourcesNotFoundException;
@Provider
public class DataResourcesNotFoundExceptionMapper implements ExceptionMapper<DataResourcesNotFoundException> {

	@Override
	public Response toResponse(DataResourcesNotFoundException arg0) {
		ErrorMessage errorMessage = new ErrorMessage(arg0.getMessage(), 404, "www.userproduct.com");
		return Response.status(Status.NOT_FOUND).type(MediaType.TEXT_PLAIN).entity(errorMessage).build();
	}

}
