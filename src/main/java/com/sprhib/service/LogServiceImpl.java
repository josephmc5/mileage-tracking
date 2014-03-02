package com.sprhib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.LogDAO;
import com.sprhib.model.Log;

@Service
@Transactional
public class LogServiceImpl implements LogService {
	
	@Autowired
	private LogDAO logDAO;

	public void addLog(Log log) {
		logDAO.addLog(log);		
	}

	public void updateLog(Log log) {
		logDAO.updateLog(log);
	}

	public Log getLog(int id) {
		return logDAO.getLog(id);
	}

	public void deleteLog(int id) {
		logDAO.deleteLog(id);
	}

	public List<Log> getLogs() {
		return logDAO.getLogs();
	}

}
