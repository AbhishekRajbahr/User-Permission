package com.userlogin.User_Login_Register.controller;

import java.util.Date;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.userlogin.User_Login_Register.Repository.UserRegisterRepository;
import com.userlogin.User_Login_Register.modal.UserRegister;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserResterController {

	@Autowired
	private UserRegisterRepository userRegisterRepository;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<String> UserRegister(@Valid @RequestBody UserRegister UserRegister) {

		UserRegister.setCratedate(new Date());
		UserRegister useregister = userRegisterRepository.save(UserRegister);
		return ResponseEntity.ok("{\r\n"
				+ "    \"message\": \"Successfully\"\r\n"
				+ "}");

	}

}
