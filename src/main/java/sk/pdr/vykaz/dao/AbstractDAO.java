package sk.pdr.vykaz.dao;

import java.util.List;

public interface AbstractDAO<T> {
	public List<T> listAll();
}
