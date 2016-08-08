package sk.pdr.vykaz.dao.impl;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.dao.ProjectDAO;
import sk.pdr.vykaz.model.Project;

@Repository
public class ProjectDAOImpl extends GenericDAO<Project> implements ProjectDAO {
	public Project getWithActivities(Long id) {
		Project p = get(id);
		Hibernate.initialize(p.getActivityList());
		return p;
	}
}
