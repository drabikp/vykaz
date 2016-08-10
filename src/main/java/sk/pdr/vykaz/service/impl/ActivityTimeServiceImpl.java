package sk.pdr.vykaz.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sk.pdr.vykaz.model.ActivityTime;
import sk.pdr.vykaz.service.ActivityTimeService;
import sk.pdr.vykaz.service.GenericService;

@Service("activityTimeService")
public class ActivityTimeServiceImpl extends GenericService<ActivityTime> implements ActivityTimeService {

	@Transactional
	public List<ActivityTime> getActivitiesByDay(LocalDate date) {
		//Criteria c = 
	}
	
}
