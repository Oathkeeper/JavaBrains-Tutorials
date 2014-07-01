package ca.owenpeterson.action;


import org.apache.commons.lang3.StringUtils;

import ca.owenpeterson.model.User;
import ca.owenpeterson.service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private User user = new User();
	
	public String execute() {
		
		LoginService loginService = new LoginService();

		if (loginService.verifyLogin(user)) {
			return SUCCESS;
		}
		else {
			return LOGIN;
		}		
	}
	
	public void validate() {
		if (StringUtils.isEmpty(user.getUserId())) {
			//user id is blank
			addFieldError("userId", "User ID cannot be blank");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			//password is blank
			addFieldError("password", "Password cannot be blank");
		}
		
	}
	
	@Override
	public User getModel() {
		
		return user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	


}
