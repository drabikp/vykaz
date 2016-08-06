package sk.pdr.vykaz.dao.impl;

import org.springframework.stereotype.Repository;

import sk.pdr.vykaz.dao.ActivityDAO;
import sk.pdr.vykaz.dao.GenericDAO;
import sk.pdr.vykaz.model.Activity;

@Repository("activityDAO")
public class ActivityDAOImpl extends GenericDAO<Activity> implements ActivityDAO {
}
