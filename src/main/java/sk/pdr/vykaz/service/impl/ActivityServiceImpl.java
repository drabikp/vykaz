package sk.pdr.vykaz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import sk.pdr.vykaz.dao.ActivityDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Activity;
import sk.pdr.vykaz.service.ActivityService;
import sk.pdr.vykaz.service.GenericService;

@Service
public class ActivityServiceImpl extends GenericService<Activity> implements ActivityService {
	private ActivityDAO activityDAO;
	
	public ActivityServiceImpl() {}
	
	@Autowired
	public ActivityServiceImpl(@Qualifier("activityDAO") GenericDAO<Activity> dao) {
		super(dao);
		this.setActivityDAO((ActivityDAO) dao);
	}

	public ActivityDAO getActivityDAO() {
		return activityDAO;
	}

	public void setActivityDAO(ActivityDAO activityDAO) {
		this.activityDAO = activityDAO;
	}

}
