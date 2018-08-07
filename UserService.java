package lti.hola.service;
/**
 * 
 * @author tasneem,valli,vanshree
 * @version 1.0
 *
 */
import lti.hola.bean.ForgetBean;
import lti.hola.bean.LoginBean;
import lti.hola.bean.RegisterBean;

public interface UserService {

	RegisterBean authenticate(LoginBean login);
	
	boolean validate(ForgetBean forget);
	
	boolean changePassword(LoginBean login);
	
	boolean persist(RegisterBean register);
	
}
