package com.userlogin.User_Login_Register.modal;

public class UserLogin {
	
	private Integer login_id;
	private String username;
	private String password;
	public Integer getLogin_id() {
		return login_id;
	}
	public void setLogin_id(Integer login_id) {
		this.login_id = login_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserLogin(Integer login_id, String username, String password) {
		super();
		this.login_id = login_id;
		this.username = username;
		this.password = password;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserLogin [login_id=" + login_id + ", username=" + username + ", password=" + password + "]";
	}
	
	
	

}
