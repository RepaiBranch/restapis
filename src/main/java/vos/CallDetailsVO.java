package vos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CallDetailsVO 
{
	@JsonProperty
	private int _callId;

	@JsonProperty
	private String _callerName;
	
	@JsonProperty
	private String _callerAddress;
	
	@JsonProperty
	private String _callTitle;
	
	@JsonProperty
	private String _callDesc;
	
	@JsonProperty
	private String _callerPhoneNo;
	
	@JsonProperty
	private String _callStatus;
	
	
	public CallDetailsVO() {}
	
	public CallDetailsVO(int callId, String callerName, String callerAddress, String callTitle, 
			String callDesc, String callerPhoneNo, String callStatus)
	{
		_callId = callId;
		_callerName = callerName;
		_callTitle = callTitle;
		_callerAddress = callerAddress;
		_callDesc = callDesc;
		_callerPhoneNo = callerPhoneNo;
		_callStatus = callStatus;
		
	}
	
	public int getCallId() {return _callId;}
	public String getCallTitle() { return _callTitle;}
	public String getCallerAddress() {return _callerAddress;}
	public String getCallName() {return _callerName;}
	public String getCallDesc() {return _callDesc;}
	public String getCallerPhoneNo() {return this._callerPhoneNo;}
	public String getCallStatus() {return this._callStatus;}
	
	public void setCallId(int callId) {this._callId = callId;} 
	public void setCallTitle(String callTitle) {this._callTitle = callTitle;} 
	public void setCallerAddress(String callerAddress) {this._callerAddress = callerAddress;}
	public void setCallerName(String callerName) {this._callerName = callerName;}
	public void setCallerDesc(String callerDesc) {this._callDesc = callerDesc;}
	public void setCallStatus(String callStatus){this._callStatus = callStatus;}


}
