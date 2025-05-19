package com.userlogin.User_Login_Register.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.userlogin.User_Login_Register.modal.Login_User_Details;

public interface UserRoleRepositosry extends CrudRepository<Login_User_Details, Long>{

	@Query(value = "SELECT roles.role_id, roles.register_id, roles.user_role_id, per.user_role_en, per.user_role_as,reg.username " +
	        "FROM User_Role roles " +
	        "INNER JOIN User_Role_Permistion per ON roles.user_role_id = per.user_role_id " +
	        "INNER JOIN register reg ON roles.register_id=reg.register_id "+
	        "WHERE roles.register_id = :register_id", nativeQuery = true)
	List<Login_User_Details> findLoginUser_Details(@Param("register_id") Long register_id);

}
