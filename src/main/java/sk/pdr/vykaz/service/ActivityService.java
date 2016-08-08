package sk.pdr.vykaz.service;

import java.time.LocalDateTime;

import sk.pdr.vykaz.model.Activity;
import sk.pdr.vykaz.model.Project;

public interface ActivityService extends AbstractService<Activity> {
	public void add(String name, LocalDateTime start, LocalDateTime end, Project project);
}
