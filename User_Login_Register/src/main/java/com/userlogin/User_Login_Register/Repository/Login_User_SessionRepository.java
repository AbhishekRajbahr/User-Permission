package com.userlogin.User_Login_Register.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.userlogin.User_Login_Register.modal.LoginUser_Exit_Details;
import com.userlogin.User_Login_Register.modal.Login_User_Session;

public interface Login_User_SessionRepository extends CrudRepository<Login_User_Session, Long>{

	@Query(value = "SELECT COALESCE( (SELECT session_id FROM login_user_session WHERE register_id =:register_id  LIMIT 1),0) AS session_id ", nativeQuery = true)
	Long findLogingUserExists(@Param("register_id") Long register_id);	
	
	@Query(value = "select * from login_user_session where session_id=:session_id", nativeQuery = true)
	Login_User_Session findLogingUser_Exists_Details(@Param("session_id") Long session_id);	

	
}
