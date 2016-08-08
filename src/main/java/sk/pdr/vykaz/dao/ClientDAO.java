package sk.pdr.vykaz.dao;

import java.util.List;

import sk.pdr.vykaz.model.Client;
import sk.pdr.vykaz.model.Project;

public interface ClientDAO extends AbstractDAO<Client> {
	public Client getWithProjects(Long id);

}
