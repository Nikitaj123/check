package com.lti.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api")
public class ShowName {
	@GET
	@Path("/hello/{name}")
	@Produces(MediaType.TEXT_HTML)
	public Response sayHello(@PathParam("name")String myname)
	{
		String htmlText = "<html><head><title>Home-Page</title></head><body><h1>Hello " + myname + "</h1></body></html>";
		return Response.status(200).entity(htmlText).build();
	}
}
