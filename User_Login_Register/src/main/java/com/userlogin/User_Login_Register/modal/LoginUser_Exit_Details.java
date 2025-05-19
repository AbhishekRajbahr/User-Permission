package com.userlogin.User_Login_Register.modal;

public class LoginUser_Exit_Details {

	private Long sessionId;
	private Long registerId;
	private Integer loginCount;

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public Long getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Long registerId) {
		this.registerId = registerId;
	}

	public Integer getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public LoginUser_Exit_Details(Long sessionId, Long registerId, Integer loginCount) {
		this.sessionId = sessionId;
		this.registerId = registerId;
		this.loginCount = loginCount;
	}

	public LoginUser_Exit_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginUser_Exit_Details [sessionId=" + sessionId + ", registerId=" + registerId + ", loginCount="
				+ loginCount + "]";
	}
	
}
