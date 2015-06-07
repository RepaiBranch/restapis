package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.SqlQueries;

@Path("/")
public class RBServiceExecController {

	 private SqlQueries _sqlDao;
     private static final int threadPoolSize = 10;

     public RBServiceExecController(SqlQueries dao) {
         _sqlDao = dao;
     }
     
    // typical get call. This is as a health check
     @GET
     @Path("get")
     @Produces(value = MediaType.APPLICATION_JSON)
     public Response sampleGet(@PathParam("servId") int servId) {
         List<String> cfgList = new ArrayList<String>();

         cfgList.add("SR1");
         cfgList.add("SR2");
 
         return Response.ok(cfgList).header("Access-Control-Allow-Origin", "*").build();

     }
     
     @POST
     @Path("call/post")
     @Consumes(value = MediaType.APPLICATION_JSON)
     public Response postUserData() {
         try {
        	 // 	can make data entries here by call sqlDao class
          
         } catch (Exception exc) {
             return Response.ok().header("Access-Control-Allow-Origin", "*").build();
         }
         return Response.ok("200").header("Access-Control-Allow-Origin", "*").build();
     }
     
     
     
}
