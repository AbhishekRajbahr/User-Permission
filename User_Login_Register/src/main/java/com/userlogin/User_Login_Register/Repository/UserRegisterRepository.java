package com.userlogin.User_Login_Register.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.userlogin.User_Login_Register.modal.Login_User_Details;
import com.userlogin.User_Login_Register.modal.UserRegister;

@Repository
public interface UserRegisterRepository extends CrudRepository<UserRegister, Integer> {

	@Query(nativeQuery = true, value = "select exists(SELECT 1 FROM public.register WHERE username = :username AND password = :password)")
	public boolean LoginUserValidate(@Param("username") String username, @Param("password") String password);
	
	@Query(value = "SELECT COALESCE( (SELECT register_id FROM public.register WHERE username =:username AND password =:password LIMIT 1),0) AS register_id ", nativeQuery = true)
	Long findRegisterIdIfExists(@Param("username") String username, @Param("password") String password);
	
	
	
}

