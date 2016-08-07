package sk.pdr.vykaz.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
	
	@PostConstruct
	public void init() {
		//temp
/*		activityService.add("new", LocalDateTime.now(), LocalDateTime.now(), 25);
		List<Activity> list = activityService.listAll();
		list.clear();*/
		Client c = new Client();
		c.setName("klient6667");
		clientService.update(c);
		
		Project p = new Project();
		p.setName("Projekt7778");
		p.setClient(c);
		List<Activity> activities = new ArrayList<>();
		Activity a = new Activity();
		a.setName("prva");
		a.setStart(LocalDateTime.now());
		a.setEnd(LocalDateTime.now());
		
		activities.add(a);
		
		Activity b = new Activity();
		b.setName("druha");
		b.setStart(LocalDateTime.now());
		b.setEnd(LocalDateTime.now());
		
		activities.add(b);
		
		p.addActivities(activities);
		
		projectService.update(p);
		
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
	
	
}
