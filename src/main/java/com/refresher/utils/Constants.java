package com.refresher.utils;
public enum Constants{
	LOGIN_JSP_PATH("/WEB-INF/views/login.jsp"), //
	HOME_JSP_PATH("/WEB-INF/views/home.jsp"), //
	INVALID_USER("Invalid User!");
	//
	private final String string;
	
	private Constants(String string){
		this.string = string;
	}
	
	public String getStr(){
		return this.string;
	}
}
