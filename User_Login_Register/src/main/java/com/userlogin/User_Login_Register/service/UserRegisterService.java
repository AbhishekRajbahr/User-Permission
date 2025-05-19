package com.userlogin.User_Login_Register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userlogin.User_Login_Register.Repository.UserRegisterRepository;
import com.userlogin.User_Login_Register.modal.UserRegister;

@Service
public class UserRegisterService {

	@Autowired
	private UserRegisterRepository userRegisterRepository;
	
	public UserRegister UserRegister_Save(UserRegister userRegister) {
		
		return userRegisterRepository.save(userRegister);
	}
}
