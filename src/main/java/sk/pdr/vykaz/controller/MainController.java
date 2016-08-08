package sk.pdr.vykaz.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import sk.pdr.vykaz.model.Activity;
import sk.pdr.vykaz.model.Client;
import sk.pdr.vykaz.model.Project;
import sk.pdr.vykaz.service.ActivityService;
import sk.pdr.vykaz.service.ClientService;
import sk.pdr.vykaz.service.ProjectService;

@ManagedBean
@ViewScoped
public class MainController {
	
	@ManagedProperty("#{activityService}")
	private ActivityService activityService;
	
	@ManagedProperty("#{clientService}")
	private ClientService clientService;
	
	@ManagedProperty("#{projectService}")
	private ProjectService projectService;
	
	private Client selectedClient;
	private List<Client> clientList;
	
	private Project selectedProject;
	private List<Project> projectList;
	
	private Activity selectedActivity;
	private List<Activity> activityList;
	
	private String newClientName;
	private String newProjectName;
	
	@PostConstruct
	public void init() {
		clientList = clientService.listAll();
		selectedClient = new Client();
	}
	public void setActivityService(ActivityService activityService) {
		this.activityService = activityService;
	}
	
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	
	public void onChangeClient() {
		selectedClient = clientService.getWithProjects(selectedClient.getId());
		projectList = selectedClient.getProjectList();
		activityList = null;
	}
	
	public void onChangeProject() {
		selectedProject = projectService.getWithActivities(selectedProject.getId());
		activityList = selectedProject.getActivityList();
	}
	
	public void actionAddNewClient() {
		Client c = new Client(newClientName);
		clientService.update(c);
		clientList = clientService.listAll();
		newClientName = "";
	}
	
	public void actionAddNewProject() {
		Project p = new Project(getNewProjectName());
		clientService.addProject(selectedClient, p);
		setNewProjectName("");
		onChangeClient();
	}
	
	public void actionDeleteClient(Long id) {
		clientService.delete(id);
		clientList = clientService.listAll();
		if (selectedClient.getId() == id) { 
			resetForm();
		}
	}
	
	private void resetForm() {
		selectedClient = new Client();
		projectList = null;
		activityList = null;
	}
	
	public Client getSelectedClient() {
		return selectedClient;
	}
	public void setSelectedClient(Client selectedClient) {
		this.selectedClient = selectedClient;
	}
	public List<Client> getClientList() {
		return clientList;
	}
	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}
	public Project getSelectedProject() {
		return selectedProject;
	}
	public void setSelectedProject(Project selectedProject) {
		this.selectedProject = selectedProject;
	}
	public List<Project> getProjectList() {
		return projectList;
	}
	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}
	public Activity getSelectedActivity() {
		return selectedActivity;
	}
	public void setSelectedActivity(Activity selectedActivity) {
		this.selectedActivity = selectedActivity;
	}
	public List<Activity> getActivityList() {
		return activityList;
	}
	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}
	public String getNewClientName() {
		return newClientName;
	}
	public void setNewClientName(String newClientName) {
		this.newClientName = newClientName;
	}
	public String getNewProjectName() {
		return newProjectName;
	}
	public void setNewProjectName(String newProjectName) {
		this.newProjectName = newProjectName;
	}
	
	
}
