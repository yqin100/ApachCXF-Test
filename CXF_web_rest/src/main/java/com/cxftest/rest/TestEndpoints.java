package com.cxftest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/textcxf")
public interface TestEndpoints {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/helloWorld")
	public String getHelloWorld(@PathParam("input") String input);
}
