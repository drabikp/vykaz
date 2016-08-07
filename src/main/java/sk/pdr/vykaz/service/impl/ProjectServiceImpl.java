package sk.pdr.vykaz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.dao.ProjectDAO;
import sk.pdr.vykaz.model.Project;
import sk.pdr.vykaz.service.GenericService;
import sk.pdr.vykaz.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl extends GenericService<Project> implements ProjectService {
	private ProjectDAO projectDAO;
	
	public ProjectServiceImpl() {}
	
	@Autowired
	public ProjectServiceImpl(GenericDAO<Project> dao) {
		super(dao);
		this.setProjectDAO((ProjectDAO)dao);
	}

	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}
	
	

}
