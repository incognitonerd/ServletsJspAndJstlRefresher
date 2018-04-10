package com.refresher.utils;
public enum Constants{
	LOGIN_JSP_PATH("/WEB-INF/views/login.jsp"), //
	LOGIN_PAGE("/login.do"), //
	HOME_JSP_PATH("/WEB-INF/views/home.jsp"), //
	ADD_ACTIVITY_JSP_PATH("/WEB-INF/views/addactivity.jsp"), //
	ADD_ACTIVITY_PAGE("/add-activity.do"), //
	LIST_ACTIVITIES_PAGE("/list-activities.do"), //
	REMOVE_ACTIVITY_PAGE("/remove-activity.do"), //
	INVALID_USER("Invalid User!"),;
	//
	private final String string;
	
	private Constants(String string){
		this.string = string;
	}
	
	public String getStr(){
		return this.string;
	}
}
