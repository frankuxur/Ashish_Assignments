package com.log;

public class LoginService {
	public boolean validateUser(String user, String email, String password) {
		return user.equalsIgnoreCase("abc") && email.equals("abc@gmail.com") && password.equals("abc");
	}

}