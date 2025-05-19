package com.userlogin.User_Login_Register.modal;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login_user_session")
public class Login_User_Session {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long session_id;
    private Long register_id;
    private Date login_date;
    private Date last_login_date;
    private Long login_count;
    private boolean isactive;
	public Long getSession_id() {
		return session_id;
	}
	public void setSession_id(Long session_id) {
		this.session_id = session_id;
	}
	public Long getRegister_id() {
		return register_id;
	}
	public void setRegister_id(Long register_id) {
		this.register_id = register_id;
	}
	public Date getLogin_date() {
		return login_date;
	}
	public void setLogin_date(Date login_date) {
		this.login_date = login_date;
	}
	public Date getLast_login_date() {
		return last_login_date;
	}
	public void setLast_login_date(Date last_login_date) {
		this.last_login_date = last_login_date;
	}
	public Long getLogin_count() {
		return login_count;
	}
	public void setLogin_count(Long login_count) {
		this.login_count = login_count;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public Login_User_Session() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Login_User_Session(Long session_id, Long register_id, Date login_date, Date last_login_date,
			Long login_count, boolean isactive) {
		super();
		this.session_id = session_id;
		this.register_id = register_id;
		this.login_date = login_date;
		this.last_login_date = last_login_date;
		this.login_count = login_count;
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "Login_User_Session [session_id=" + session_id + ", register_id=" + register_id + ", login_date="
				+ login_date + ", last_login_date=" + last_login_date + ", login_count=" + login_count + ", isactive="
				+ isactive + "]";
	}
    
    
}
