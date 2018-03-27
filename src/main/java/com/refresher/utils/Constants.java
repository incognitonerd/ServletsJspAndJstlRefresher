package com.refresher.utils;
public enum Constants{
	LOGIN_JSP_PATH("/WEB-INF/views/login.jsp"), //
	LOGIN_PAGE("/login.do"), //
	ACTIVITIES_JSP_PATH("/WEB-INF/views/activities.jsp"), //
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
