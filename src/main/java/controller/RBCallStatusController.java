package controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.jetty.http.HttpStatus;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.util.JSONPObject;

import model.SqlQueries;
import vos.CallAssignVO;
import vos.CallDetailsVO;

@Path("/callstatus/")
public class RBCallStatusController 
{
	private SqlQueries _sqlDao;
    private static final int threadPoolSize = 10;

    public RBCallStatusController(SqlQueries dao) {
        _sqlDao = dao;
    }
    
    // 	This call is supposed to assign a call to a particular user. It can be used in multiple ways
    //  a). As an API where a service centre admin will assign a call to a service centre exec
    //  b). As an API in the service exec's app through which he assigns himself a call
    //	Output will have a list of CallVO Objects 
    @POST
    @Path("rest/assign")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response assignCall(CallAssignVO assignVO) {
        try
    	{
        	
    	        
    	}
    	catch (Exception exc)
    	{
    		return Response.ok(HttpStatus.INTERNAL_SERVER_ERROR_500).header("Access-Control-Allow-Origin", "*").build();
    	}
    	
        return Response.ok(HttpStatus.OK_200).header("Access-Control-Allow-Origin", "*").build();

    }

}
