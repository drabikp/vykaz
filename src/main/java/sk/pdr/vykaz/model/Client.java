package sk.pdr.vykaz.model;

import java.util.List;

public class Client extends AbstractEntity {	
	private String name;
	private List<Project> projectList;
	
	public Client() {
		super();
	}
	
	public Client(long id, String name) {
		super(id); 
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
}
