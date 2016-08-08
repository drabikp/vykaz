package sk.pdr.vykaz.service;

import java.util.List;

import sk.pdr.vykaz.model.Client;
import sk.pdr.vykaz.model.Project;

public interface ClientService extends AbstractService<Client>{
	public Client getWithProjects(Long id);
	public List<Project> addProject(Client c, Project p);
}
