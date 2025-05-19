package com.userlogin.User_Login_Register.modal;

import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="Register")
public class UserRegister {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer register_id;
    @NotBlank(message = "Username is required")
    @Email(message = "Envalid email format")
	private String username;
    @NotBlank(message = "Password is required")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",message = "Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character")
	private String password;
	private Date cratedate;
	private Integer role_id;
	private boolean isactive;
	public Integer getRegister_id() {
		return register_id;
	}
	public void setRegister_id(Integer register_id) {
		this.register_id = register_id;
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
	public Date getCratedate() {
		return cratedate;
	}
	public void setCratedate(Date cratedate) {
		this.cratedate = cratedate;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegister(Integer register_id, String username, String password, Date cratedate, Integer role_id,
			boolean isactive) {
		super();
		this.register_id = register_id;
		this.username = username;
		this.password = password;
		this.cratedate = cratedate;
		this.role_id = role_id;
		this.isactive = isactive;
	}
	@Override
	public String toString() {
		return "UserRegister [register_id=" + register_id + ", username=" + username + ", password=" + password
				+ ", cratedate=" + cratedate + ", role_id=" + role_id + ", isactive=" + isactive + "]";
	}
	
	

}
