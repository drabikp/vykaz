package sk.pdr.vykaz.dao;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sk.pdr.vykaz.model.AbstractEntity;

@Repository
public abstract class GenericDAO<T extends AbstractEntity> implements AbstractDAO<T> {
	@Autowired
	private SessionFactory sessionFactory;
	protected Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public GenericDAO() {
		entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<T> listAll() {
		return (List<T>) getSession().createQuery("from " + entityClass.getName()).list();
	}
	
	public void update(T item) {
		/*if (item.getId() != null && getSession().get(entityClass, item.getId()) != null) {
			getSession().update(item);
			//TODO: check if merge method would be more suitable
		} else {
			item.setId((Long) getSession().save(item)); 
		}*/
		getSession().saveOrUpdate(item);
	}
	
	public T get(Long id) {
		return getSession().get(entityClass, id);
	}
	
	public void delete(T item) {
		getSession().delete(item);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
