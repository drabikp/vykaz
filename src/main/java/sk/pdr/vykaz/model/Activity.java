package sk.pdr.vykaz.model;

import java.time.LocalDateTime;

public class Activity extends AbstractEntity {
	private LocalDateTime start;
	private LocalDateTime end;
	private String name;
	//private long projectId;
	private Project project;
	
	public Activity() {}
	
	public Activity(long id, LocalDateTime start, LocalDateTime end, String name, long projectId) {
		super(id);
		this.start = start;
		this.end = end;
		this.name = name;
		//this.projectId = projectId;
	}

	public LocalDateTime getStart() {
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
	}

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

	/*public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}*/
}
