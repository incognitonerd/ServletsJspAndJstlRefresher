package com.refresher.services;
public class ValidateUserService {
	public boolean isValidUser(String usr, String pw){
		if(usr.equalsIgnoreCase("abc") && pw.equals("123"))
			return true;
		return false;
	}
}
