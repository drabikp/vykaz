package sk.pdr.vykaz.service;

import sk.pdr.vykaz.dao.AbstractDAO;

public interface AbstractService<T> extends AbstractDAO<T> {
	public void delete(Long id);
}
