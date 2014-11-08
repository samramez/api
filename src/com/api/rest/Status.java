package com.api.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/v1/status")
public class Status {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitile(){
		return "<p>API test blah blah<p>";
	}
	

}
