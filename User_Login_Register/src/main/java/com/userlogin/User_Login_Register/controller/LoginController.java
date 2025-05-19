package com.userlogin.User_Login_Register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userlogin.User_Login_Register.modal.UserLogin;
import com.userlogin.User_Login_Register.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value="/user",method=RequestMethod.POST)
	public ResponseEntity<?> User_Login(@RequestBody UserLogin userLogin) {
	ResponseEntity<?> userdetila=loginService.User_Logins(userLogin);
	return userdetila;
	}
}
