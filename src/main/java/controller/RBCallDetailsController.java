package controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.SqlQueries;
import vos.CallDetailsVO;
import vos.CallVO;

@Path("/calldetails/")
public class RBCallDetailsController {
	
	private SqlQueries _sqlDao;
    private static final int threadPoolSize = 10;

    public RBCallDetailsController(SqlQueries dao) {
        _sqlDao = dao;
    }
    
    // 	This call is supposed to return all the calls assigned to a service executive
    //  Request to contain serviceExec's Id, latitude and longitude of the device 
    //	Output will have a list of CallVO Objects 
    @GET
    @Path("rest/get/{userId}/{callId}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getCallDetails(@PathParam("userId") int userId, @PathParam("callId") int callId) {
        
    	CallDetailsVO callDetails = getCallDetailsExecId(userId, callId);
        return Response.ok(callDetails).header("Access-Control-Allow-Origin", "*").build();

    }

	private CallDetailsVO getCallDetailsExecId(int userId, int callId) {
		return new CallDetailsVO(1,"Raghuram","Kodichi Patel Krishna","Jaguar Tap Leak", "Raghu's tap in the kitchen is leaking. Could be an issue of broken washer","9880522251","ACTIVE");
		// TODO building the logic to fetch the above data from db
	}

}
