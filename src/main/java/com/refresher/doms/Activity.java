package com.refresher.doms;
public class Activity {
	private String name;
	private String season;
	
	public Activity(String name, String season){
		this.name = name;
		this.season = season;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getSeason(){
		return season;
	}
	
	public void setSeason(String season){
		this.season = season;
	}
	
	@Override
	public String toString(){
		return "Activity [name=" + name + ", season=" + season + "]";
	}
	
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		if(name == null){
			if(other.name != null)
				return false;
		} else if(!name.equals(other.name))
			return false;
		return true;
	}
}
