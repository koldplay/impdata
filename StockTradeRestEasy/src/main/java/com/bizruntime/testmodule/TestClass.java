package com.bizruntime.testmodule;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/myresource")
public class TestClass {
	
	@GET
	@Path("/path")
	public String getMsg(){
		return "Test";
	}
}
