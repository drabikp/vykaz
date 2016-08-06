package sk.pdr.vykaz.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sk.pdr.vykaz.dao.AbstractDAO;

@Service
public abstract class GenericService<T> implements AbstractService<T> {

	//@Autowired
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

	public AbstractDAO<T> getAbstractDao() {
		return abstractDao;
	}

	public void setAbstractDao(AbstractDAO<T> abstractDao) {
		this.abstractDao = abstractDao;
	}
}
