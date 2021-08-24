package org.sample;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/simple")
public class SimpleService {



    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    @POST
    @Path("/token")
    public String getToken(String param){
        return "Json: " + param;
    }


    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    @POST
    @Path("/token")
    public String getToken2(@FormParam("field1") String field1,  @FormParam("field2") String field2){
        return "URLENCODED: f1=" + field1 + " f2=" + field2;
    }



    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    @Path("/token")
    public String hello(){
        return "hello";
    }

}
