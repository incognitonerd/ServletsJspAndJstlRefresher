package com.refresher.services;
import java.util.ArrayList;
import java.util.List;
import com.refresher.models.Activity;

public class ActivitiesService {
	private static List<Activity> activities = new ArrayList<>();
	static{
		activities.add(new Activity("Snorkel"));
		activities.add(new Activity("Dance"));
		activities.add(new Activity("Fish"));
		activities.add(new Activity("Hike"));
	}
	
	public List<Activity> getActivities(){
		return activities;
	}
	
	public void addActivity(Activity act){
		activities.add(act);
	}
	
	public void removeActivity(Activity act){
		activities.remove(act);
	}
}
