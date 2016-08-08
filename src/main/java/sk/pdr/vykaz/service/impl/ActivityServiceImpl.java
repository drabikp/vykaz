package sk.pdr.vykaz.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sk.pdr.vykaz.dao.ActivityDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Activity;
import sk.pdr.vykaz.model.Project;
import sk.pdr.vykaz.service.ActivityService;
import sk.pdr.vykaz.service.GenericService;

@Service("activityService")
public class ActivityServiceImpl extends GenericService<Activity> implements ActivityService {
	private ActivityDAO activityDAO;
	
	public ActivityServiceImpl() {}
	
	@Autowired
	public ActivityServiceImpl(GenericDAO<Activity> dao) {
		super(dao);
		this.setActivityDAO((ActivityDAO) dao);
	}

	public ActivityDAO getActivityDAO() {
		return activityDAO;
	}

	public void setActivityDAO(ActivityDAO activityDAO) {
		this.activityDAO = activityDAO;
	}
	
	@Transactional
	public void add(String name, LocalDateTime start, LocalDateTime end, Project project) {
		Activity item = new Activity();
		item.setName(name);
		item.setEnd(end);
		item.setStart(start);
		item.setProject(project);
		activityDAO.update(item);
	}

}
