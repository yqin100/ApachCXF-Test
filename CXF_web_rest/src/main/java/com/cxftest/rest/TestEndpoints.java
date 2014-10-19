package com.cxftest.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cxftest.model.TestResponse;

@Path("/textcxf")
public interface TestEndpoints {
	public static final String URI_HELLO_WORLD = "/helloWorld";
	public static final String PATH_TEXT = "/text";
	public static final String PATH_XML = "/xml";
	public static final String PATH_JSON = "/json";
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path(URI_HELLO_WORLD + PATH_TEXT + "/{input}")
	public String getHelloWorldTextPath(@PathParam("input") String input);

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path(URI_HELLO_WORLD + PATH_TEXT)
	public String getHelloWorldTextQuery(@QueryParam("input") String input);

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path(URI_HELLO_WORLD + PATH_XML + "/{input}")
	public TestResponse getHelloWorldXmlPath(@PathParam("input") String input);

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path(URI_HELLO_WORLD + PATH_XML)
	public TestResponse getHelloWorldXmlQuery(@QueryParam("input") String input);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(URI_HELLO_WORLD + PATH_JSON + "/{input}")
	public TestResponse getHelloWorldJsonPath(@PathParam("input") String input);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(URI_HELLO_WORLD + PATH_JSON)
	public TestResponse getHelloWorldJsonQuery(@QueryParam("input") String input);
}
