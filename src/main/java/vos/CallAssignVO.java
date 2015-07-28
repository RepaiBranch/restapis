package vos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallAssignVO 
{
	@JsonProperty
	private int _callId;

	@JsonProperty
	private int _userId;
	
	@JsonProperty
	private String _status;
	
	public CallAssignVO() {}
	
	public CallAssignVO(int callId, int userId, String status)
	{
		_callId = callId;
		_userId = userId;
		_status = status;
	}
	
	public int getCallId() {return _callId;}
	public int getUserId() {return _userId;}
	public String getStatus() {return _status;}
	
	public void setCallId(int callId){ _callId = callId;}
	public void setUserId(int userId) { _userId = userId;}
	public void setStatus(String status) {_status = status;}
	
	
	
	

}
