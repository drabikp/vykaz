package sk.pdr.vykaz.service;

import java.time.LocalDate;
import java.util.List;

import sk.pdr.vykaz.model.ActivityTime;

public interface ActivityTimeService extends AbstractService<ActivityTime> {
	public List<ActivityTime> getActivitiesByDay(LocalDate date);
}
