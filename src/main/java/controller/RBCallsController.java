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

import org.eclipse.jetty.http.HttpStatus;

import vos.CallAssignVO;
import vos.CallVO;
import vos.CompleteCallVO;
import model.SqlQueries;

@Path("/calls/")
public class RBCallsController 
{
	private SqlQueries _sqlDao;
    private static final int threadPoolSize = 10;

    public RBCallsController(SqlQueries dao) {
        _sqlDao = dao;
    }
    
    // 	This call is supposed to return all the calls assigned to a service executive
    //  Request to contain serviceExec's Id, latitude and longitude of the device 
    //	Output will have a list of CallVO Objects 
    @GET
    @Path("rest/get/{userId}/{lat}/{longitude}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getCalls(@PathParam("userId") int userId, @PathParam("lat") String latitude, @PathParam("longitude") String longitude) {
        
    	List<CallVO> callsVoList = getUserIdCalls(userId, latitude, longitude);
        return Response.ok(callsVoList).header("Access-Control-Allow-Origin", "*").build();

    }
    
    // This method will ensure that a portal can be setup where a user can create calls directly
    // this portal is to be managed by the service centre executive to begin with.
    @POST
    @Path("rest/create")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response createCall(CompleteCallVO comCallVO) {
    	int callId = 0;
    	
    	try
    	{
    	    callId = createComCall(comCallVO);
    	}
    	catch (Exception exc)
    	{
    		return Response.ok(HttpStatus.INTERNAL_SERVER_ERROR_500).header("Access-Control-Allow-Origin", "*").build();
    	}
    	
        return Response.ok(callId).header("Access-Control-Allow-Origin", "*").build();

    }
    

	private int createComCall(CompleteCallVO comCallVO) {
		// TODO Auto-generated method stub
		return 1;
	}

	private List<CallVO> getUserIdCalls(int servId, String latitude,
			String longitude) {

		// this method is supposed to 
		// a. query the database and fetch all the calls assigned to this user 
		// b. we sort all the calls assigned based on the proximity to the user
		// this logic is broken but will do for now. However, at a future point, the user should get all calls around him. Need to figure out this part.
    	List<CallVO> callsList = new ArrayList<CallVO>();
    	callsList.add(new CallVO(1,"12.955115", "77.639608","Raghu has called", 1));
    	callsList.add(new CallVO(2,"12.958655", "77.638117","Saurabh has called", 2));
    	callsList.add(new CallVO(3,"12.981504", "77.637334","Arjuns Office Problem", 3));
    	
		// TODO Auto-generated method stub
		return callsList;
	}
    
    

}
