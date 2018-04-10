package com.refresher.services;
import java.util.ArrayList;
import java.util.List;
import com.refresher.doms.Activity;

public class ActivitiesService {
	private static List<Activity> activities = new ArrayList<>();
	static{
		activities.add(new Activity("Snorkel", "Summer"));
		activities.add(new Activity("Dance", "Winter"));
		activities.add(new Activity("Fish", "Fall"));
		activities.add(new Activity("Hike", "Spring"));
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
