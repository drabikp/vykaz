package sk.pdr.vykaz.model;

import java.util.ArrayList;
import java.util.List;

public class Project extends AbstractEntity {
	private List<Activity> activityList;
	private String name;
	//private long clientId;
	private Client client;
	
	public Project() {}
	
	public Project(String name) {
		this.name = name;
	}

	public List<Activity> getActivityList() {
		return activityList;
	}

	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}

//	public long getClientId() {
//		return clientId;
//	}
//
//	public void setClientId(long clientId) {
//		this.clientId = clientId;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addActivity(Activity a) {
		if (activityList == null) {
			activityList = new ArrayList<>();
		}
		a.setProject(this);
		activityList.add(a);
	}
	
	public void addActivities(List<Activity> a) {
		if (activityList == null) {
			activityList = new ArrayList<>();
		}
		for (Activity t: a) {
			addActivity(t);
		}
	}
}
