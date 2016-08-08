package sk.pdr.vykaz.dao.impl;

import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import sk.pdr.vykaz.dao.ClientDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Client;
import sk.pdr.vykaz.model.Project;

@Repository
public class ClientDAOImpl extends GenericDAO<Client> implements ClientDAO {
	public Client getWithProjects(Long id) {
		/*return (Client) getSession().createCriteria(entityClass).setFetchMode("projectList", FetchMode.JOIN)
				.add(Restrictions.idEq(id)).uniqueResult();*/
		Client c = get(id);
		Hibernate.initialize(c.getProjectList());
		return c;
	}
	
	/*@Deprecated
	public List<Project> addProject(Client c, Project p) {
		Hibernate.initialize(c.getProjectList());
		
	}*/
}
