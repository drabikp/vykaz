package sk.pdr.vykaz.model;

import java.util.List;

public class Project extends AbstractEntity {
	private List<Activity> activityList;
	private long clientId;
	
	public Project() {}

	public List<Activity> getActivityList() {
		return activityList;
	}

	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
}
