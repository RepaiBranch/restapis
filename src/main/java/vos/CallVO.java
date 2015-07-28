package vos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallVO 
{
	@JsonProperty
	private int _callId;

	@JsonProperty
	private String _lat;
	
	@JsonProperty
	private String _long;
	
	@JsonProperty
	private String _callTitle;
	
	@JsonProperty
	private int _priority;
	
	
	public CallVO() {}
	
	public CallVO(int callId, String latitude, String longitude, String callTitle, int priority)
	{
		_callId = callId;
		_lat = latitude;
		_long = longitude;
		_callTitle = callTitle;
		_priority = priority;
	}
	
	public int getCallId() {return _callId;}
	public String getLatitude() { return _lat;}
	public String getLongitude() { return _long;}
	public String getCallTitle() { return _callTitle;}
	public int getPriority() { return _priority;}
	
	public void setCallId(int callId) {this._callId = callId;}
	public void setLatitude(String latitude) {this._lat = latitude;}
	public void setLongitude(String longitude) {this._long = longitude;}
	public void setCallTitle(String callTitle) {this._callTitle = callTitle;}
	public void setPriority(int priority) {this._priority = priority;}

}
