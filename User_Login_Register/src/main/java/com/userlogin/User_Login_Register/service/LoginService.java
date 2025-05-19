package com.userlogin.User_Login_Register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.userlogin.User_Login_Register.Repository.UserRegisterRepository;
import com.userlogin.User_Login_Register.Repository.UserRoleRepositosry;
import com.userlogin.User_Login_Register.modal.Login_User_Details;
import com.userlogin.User_Login_Register.modal.UserLogin;

@Service
public class LoginService {

	@Autowired
	private UserRegisterRepository userRegisterRepository;
	
	@Autowired
	private Login_User_SessionService login_User_SessionService;

	@Autowired
	private UserRoleRepositosry userRoleRepositosry;
	
	public ResponseEntity<?> User_Logins(UserLogin userLogin) {
		// userRegisterRepository.LoginUserValidate(userLogin.getUsername(),userLogin.getPassword());
		List<Login_User_Details> user_login_details;
		Long exit_user_flag = userRegisterRepository.findRegisterIdIfExists(userLogin.getUsername(),userLogin.getPassword());
		if (exit_user_flag != 0) {
			login_User_SessionService.User_login_Session_Save(exit_user_flag);
			List<Login_User_Details> userLoginDetails = userRoleRepositosry.findLoginUser_Details(exit_user_flag);
            return ResponseEntity.ok(userLoginDetails);
		} 
		return ResponseEntity.status(401).body("[]");
	}
}
