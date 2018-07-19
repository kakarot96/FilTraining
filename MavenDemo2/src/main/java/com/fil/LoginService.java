package com.fil;

public class LoginService {
	public boolean checkValidation(String name, String password) {
		if (name.equals(password))
			return true;
		else
			return false;
	}
}
