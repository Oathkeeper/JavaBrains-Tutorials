package ca.owenpeterson.service;

import ca.owenpeterson.model.User;

public class LoginService {
	
	public boolean verifyLogin(User user) {
		if (user.getUserId().equals("userId") && user.getPassword().equals("password")) {
			return true;
		}
		return false;
	}

}
