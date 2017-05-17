package com.test.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * Created by strawberrylin on 16-11-27.
 */
public class HelloWorld {
    @GET
    @Produces("text/plain")
    public String getMessage(){
        return  "Hello World";
    }
}
