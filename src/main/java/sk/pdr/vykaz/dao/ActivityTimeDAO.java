package sk.pdr.vykaz.dao;

import java.time.LocalDate;
import java.util.List;

import sk.pdr.vykaz.model.ActivityTime;

public interface ActivityTimeDAO extends AbstractDAO<ActivityTime> {
	public List<ActivityTime> getActivitiesByDay(LocalDate date);
}
