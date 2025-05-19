package com.userlogin.User_Login_Register.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.userlogin.User_Login_Register.Repository.Login_User_SessionRepository;
import com.userlogin.User_Login_Register.modal.LoginUser_Exit_Details;
import com.userlogin.User_Login_Register.modal.Login_User_Session;

@Service
public class Login_User_SessionService {

	@Autowired
	private Login_User_SessionRepository login_User_SessionRepository;
	
	public void User_login_Session_Save(Long register_id) {
		System.out.print("register_id=="+register_id);	
		Login_User_Session login_User_Session =new Login_User_Session();
		Long session_id=login_User_SessionRepository.findLogingUserExists(register_id);
		try {
			if(session_id == 0) {
				
				login_User_Session.setRegister_id(register_id);
				login_User_Session.setLogin_date(new Date());
				login_User_Session.setLast_login_date(new Date());
				login_User_Session.setLogin_count(1L);
				login_User_Session.setIsactive(true);
				login_User_SessionRepository.save(login_User_Session);
			}else {
				Login_User_Session session_det=login_User_SessionRepository.findLogingUser_Exists_Details(session_id);
				if(session_det.getSession_id() !=null) {
					login_User_Session.setSession_id(session_det.getSession_id());;
					login_User_Session.setRegister_id(register_id);
					login_User_Session.setLogin_date(new Date());
					login_User_Session.setLast_login_date(session_det.getLogin_date());
					login_User_Session.setLogin_count(session_det.getLogin_count()+1);
					login_User_Session.setIsactive(true);
				
					login_User_SessionRepository.save(login_User_Session);	
				}
				
			}		
				
		}catch(Exception e) {}
		 
		}
}
