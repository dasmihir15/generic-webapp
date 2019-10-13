package main.apps.api;


import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;



@ApplicationPath("service")
public class ApplicationConfig extends ResourceConfig{
	
	public ApplicationConfig() {
		packages("main.apps.api");
	}

}
