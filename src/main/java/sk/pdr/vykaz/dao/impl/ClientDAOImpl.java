package sk.pdr.vykaz.dao.impl;

import org.springframework.stereotype.Repository;

import sk.pdr.vykaz.dao.ClientDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Client;

@Repository
public class ClientDAOImpl extends GenericDAO<Client> implements ClientDAO{

}
