package vos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompleteCallVO extends CallDetailsVO
{
	@JsonProperty
	private String _lat;
	
	@JsonProperty
	private String _long;
	 
	
	public CompleteCallVO(){}
	
	public CompleteCallVO(String callerName, String callerAddress, String callTitle, 
			String callDesc, String callerPhoneNo, String callStatus, String latitude, String longitude)
	{
	   _lat = latitude;
	   _long = longitude;
	   setCallerAddress(callerAddress);
	   setCallerDesc(callDesc);
	   setCallerName(callerName);
	   setCallStatus(callStatus);
	   setCallTitle(callTitle);
		
	}
	
	
	public String getLatitude() { return _lat;}
	public String getLongitude() { return _long;} 
	
 	public void setLatitude(String latitude) {this._lat = latitude;}
	public void setLongitude(String longitude) {this._long = longitude;} 
}
