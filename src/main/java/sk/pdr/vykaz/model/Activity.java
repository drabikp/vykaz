package sk.pdr.vykaz.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Activity extends AbstractEntity {
	/*private LocalDateTime start;
	private LocalDateTime end;*/
	private String name;
	//private long projectId;
	private Project project;
	private List<ActivityTime> activityTimeList;
	
	public Activity() {}
	
	public Activity(long id, /*LocalDateTime start, LocalDateTime end, */String name, long projectId) {
		super(id);
		/*this.start = start;
		this.end = end;
		*/this.name = name;
		//this.projectId = projectId;
	}

/*	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getEnd() {
		return end;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<ActivityTime> getActivityTimeList() {
		return activityTimeList;
	}

	public void setActivityList(List<ActivityTime> activityTimeList) {
		this.activityTimeList = activityTimeList;
	}

	/*public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}*/
	
	public void addActivityTime(LocalDateTime start, LocalDateTime end) {
		ActivityTime at = new ActivityTime(start, end);
		if (activityTimeList == null) {
			activityTimeList = new ArrayList<ActivityTime>();
		}
		activityTimeList.add(at);
	}
}
