package com.youtube.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1/status")
public class V1_status {
	
	public static final String version = "1.0.0";
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p> Java Web service </p>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		return "<p> Api Version: " + version + "</p>";
	}

}
