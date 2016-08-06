package sk.pdr.vykaz.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sk.pdr.vykaz.dao.ActivityDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Activity;
import sk.pdr.vykaz.service.ActivityService;

@ManagedBean
@ViewScoped
@Component
public class MainController {
	
	@Autowired
	private ActivityService activityService;
	
	@PostConstruct
	public void init() {
		//temp
		activityService.listAll();
	}
}
