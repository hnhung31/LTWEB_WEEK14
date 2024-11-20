package vn.iotstar.repository;


import vn.iotstar.entity.User;
import vn.iotstar.models.LoginUserModel;
import vn.iotstar.models.RegisterUserModel;

public interface IAuthenticationRepository {	
	public User signup(RegisterUserModel input);
	
	public User authenticate(LoginUserModel input);
}
