package com.fil;

public class LoginServiceImp1 implements LoginService {

	@Override
	public boolean checkValidation(String name, String password) {
		// TODO Auto-generated method stub
		if (name.equals(password))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "in class";
	}

	
	
}
