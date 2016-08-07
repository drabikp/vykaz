package sk.pdr.vykaz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sk.pdr.vykaz.dao.ClientDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Client;
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
}
