package in.preeti.services;

import java.util.Optional;

import in.preeti.entity.User;

public interface IUserService {

	
	Long saveUser(User user);
	Optional<User> findByUsername(String username);
	void updateUserPwd(String pwd,Long userId);
}
