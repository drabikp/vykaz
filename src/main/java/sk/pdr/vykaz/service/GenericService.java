package sk.pdr.vykaz.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sk.pdr.vykaz.dao.AbstractDAO;

@Service
public abstract class GenericService<T> implements AbstractService<T> {

	@Autowired
	private AbstractDAO<T> abstractDao;
	
	public GenericService() {
	
	}
	
	public GenericService(AbstractDAO<T> abstractDAO) {
		this.abstractDao = abstractDAO;
	}
	
	@Transactional
	public List<T> listAll() {
		return abstractDao.listAll();
	}
	
	@Transactional
	public void update(T item) {
		abstractDao.update(item);
	}
	
	@Transactional
	public T get(Long id) {
		return abstractDao.get(id);
	}
	
	@Transactional
	public void delete(T item) {
		abstractDao.delete(item);
	}
	
	@Transactional
	public void delete(Long id) {
		delete(abstractDao.get(id));
	}

	public AbstractDAO<T> getAbstractDao() {
		return abstractDao;
	}

	public void setAbstractDao(AbstractDAO<T> abstractDao) {
		this.abstractDao = abstractDao;
	}
}
