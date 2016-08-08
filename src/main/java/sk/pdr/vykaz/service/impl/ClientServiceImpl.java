package sk.pdr.vykaz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sk.pdr.vykaz.dao.ClientDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Client;
import sk.pdr.vykaz.model.Project;
import sk.pdr.vykaz.service.ClientService;
import sk.pdr.vykaz.service.GenericService;

@Service("clientService")
public class ClientServiceImpl extends GenericService<Client> implements ClientService {
private ClientDAO clientDAO;
	
	public ClientServiceImpl() {}
	
	@Autowired
	public ClientServiceImpl(GenericDAO<Client> dao) {
		super(dao);
		this.setClientDAO((ClientDAO) dao);
	}

	public ClientDAO getClientDAO() {
		return clientDAO;
	}

	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}
	
	@Transactional
	public Client getWithProjects(Long id) {
		return clientDAO.getWithProjects(id);
	}
	
	@Transactional
	public List<Project> addProject(Client c, Project p) {
		c = getWithProjects(c.getId());
		c.addProject(p);
		update(c);
		return c.getProjectList();
	}
}
