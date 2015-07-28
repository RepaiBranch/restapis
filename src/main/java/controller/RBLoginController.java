package controller;

import javax.servlet.http.Cookie;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import vos.LoginVO;
import model.SqlQueries;

@Path("/login/")
public class RBLoginController 
{
	 private SqlQueries _sqlDao;
     private static final int threadPoolSize = 10;

     public RBLoginController(SqlQueries dao) {
         _sqlDao = dao;
     }
     
     // writing dummy methods here so that they can be changed by the person 
     // who owns backend whenever needed
     
     //This API performs the session operation
     //generates a cookie and returns. Storage of cookie in the backend is necessary along with expiry time etc.
     @GET
     @Path("rest/session")
     @Produces(value = MediaType.APPLICATION_JSON)
     public Response getSession() {
         
    	    final String cookieName = "app_rb";
    	    final String cookieValue = java.util.UUID.randomUUID().toString();  
    	    final int expiryTime = 60 * 60 * 24 * 14;  // 14 days
    	    final String cookiePath = "/";

    	    Cookie myCookie = new Cookie(cookieName, cookieValue);
    	    myCookie.setSecure(false);  // determines whether the cookie should only be sent using a secure protocol, such as HTTPS or SSL
    	    myCookie.setMaxAge(expiryTime);  // A negative value means that the cookie is not stored persistently and will be deleted when the Web browser exits. A zero value causes the cookie to be deleted.
    	    myCookie.setPath(cookiePath);  // The cookie is visible to all the pages in the directory you specify, and all the pages in that directory's subdirectories
    	    
            return Response.ok(myCookie).header("Access-Control-Allow-Origin", "*").build();
     }
     
     //This API performs the login operation. Let's login a user with their phone number (and OTP). This is going forward. Not now
     @POST
     @Path("rest/signin")
     @Consumes(value = MediaType.APPLICATION_JSON)
     public Response postLogin() {
         try {
        	 // can make data entries here by call sqlDao class
        	 // do whatever magic you'd want to. return me the following : userId, whether the user has been loggedIn
        	 // Building a userResponse class. Feel free to modify/ignore
        	 return Response.ok( new LoginVO("RAGH1234",true)).header("Access-Control-Allow-Origin", "*").build();
      
         } catch (Exception exc) {
             return Response.ok().header("Access-Control-Allow-Origin", "*").build();
         }
     }
     
}
