package sk.pdr.vykaz.dao;

import java.util.List;

public interface AbstractDAO<T> {
	public List<T> listAll();
	public void update(T item);
	public T get(Long id);
	public void delete(T item);
}
