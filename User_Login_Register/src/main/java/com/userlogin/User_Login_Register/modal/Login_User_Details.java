package com.userlogin.User_Login_Register.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_Role") 
public class Login_User_Details {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long role_id;
	private Long register_id;
	private Long user_role_id;
	private String user_role_en;
	private String user_role_as;
	private String username;
	public Long getRole_id() {
		return role_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	public Long getRegister_id() {
		return register_id;
	}
	public void setRegister_id(Long register_id) {
		this.register_id = register_id;
	}
	public Long getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(Long user_role_id) {
		this.user_role_id = user_role_id;
	}
	public String getUser_role_en() {
		return user_role_en;
	}
	public void setUser_role_en(String user_role_en) {
		this.user_role_en = user_role_en;
	}
	public String getUser_role_as() {
		return user_role_as;
	}
	public void setUser_role_as(String user_role_as) {
		this.user_role_as = user_role_as;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Login_User_Details(Long role_id, Long register_id, Long user_role_id, String user_role_en,
			String user_role_as, String username) {
		super();
		this.role_id = role_id;
		this.register_id = register_id;
		this.user_role_id = user_role_id;
		this.user_role_en = user_role_en;
		this.user_role_as = user_role_as;
		this.username = username;
	}
	public Login_User_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login_User_Details [role_id=" + role_id + ", register_id=" + register_id + ", user_role_id="
				+ user_role_id + ", user_role_en=" + user_role_en + ", user_role_as=" + user_role_as + ", username="
				+ username + "]";
	}
	
	
	

}
