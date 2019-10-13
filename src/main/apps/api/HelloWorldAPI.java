package main.apps.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("test")
public class HelloWorldAPI {
	
	@GET
	public String getTest() {
		return "Hello World !!";
	}

}
