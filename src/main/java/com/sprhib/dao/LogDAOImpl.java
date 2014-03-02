package com.sprhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhib.model.Log;
import com.sprhib.model.Employee;

@Repository
public class LogDAOImpl implements LogDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addLog(Log log) {
		getCurrentSession().save(log);
	}

	public void updateLog(Log log) {
		Log logToUpdate = getLog(log.getId());
		logToUpdate.setDescription(log.getDescription());
	}

	public Log getLog(int id) {
		Log log = (Log) getCurrentSession().get(Log.class, id);
		return log;
	}

	public Log getLog(Employee employee) {
		Log log = (Log) getCurrentSession().get(Log.class, employee);
		return log;
	}

	public void deleteLog(int id) {
		Log log = getLog(id);
		if (log != null)
			getCurrentSession().delete(log);
	}

	@SuppressWarnings("unchecked")
	public List<Log> getLogs() {
		return getCurrentSession().createQuery("from Log").list();
	}

}
