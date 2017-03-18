package com.bizruntime.messanger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/inject")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectDemoReslource {

	@GET
	@Path("annota")
	public String getParamUsingAnnotation(@MatrixParam("param") String matrix,
										  @HeaderParam("header") String header,
										  @CookieParam("Cookie") String cookie
			){
		return matrix+header+cookie;
	}
	@GET 
	@Path("context")
	public String getParamUsingContext(@Context UriInfo uriInfo, @Context HttpHeaders header){
		String path = uriInfo.getAbsolutePath().toString();
		String cookie = header.getCookies().toString();
		return "Path"+path+"cookie"+cookie;
	}
}
