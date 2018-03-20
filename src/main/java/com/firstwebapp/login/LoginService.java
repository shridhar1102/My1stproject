package com.firstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean userValidation(String user, String password)
	{
		if(user.equalsIgnoreCase("shridhar")&& (password.equals("shruthi")))
				return true;
		return false;
	}

}
