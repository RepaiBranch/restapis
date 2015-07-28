package vos;

import com.fasterxml.jackson.annotation.JsonProperty;


public class LoginVO {
	
	@JsonProperty
	private String _userId;

	@JsonProperty
	private Boolean _isSignedIn;
	
	public LoginVO() {}
	
	public LoginVO(String userId, Boolean isSignedIn)
	{
		_userId = userId;
		_isSignedIn = isSignedIn;
	}
	
	public String getUserId() {return _userId;}
	public Boolean getIsUserSignedIn() { return _isSignedIn;}
	
	public void setUserId(String userId) {this._userId = userId;}
	public void setIsSignedIn(Boolean isSignedIn) {this._isSignedIn = isSignedIn;}
	

}
