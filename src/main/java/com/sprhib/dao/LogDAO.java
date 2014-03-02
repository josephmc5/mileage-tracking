package com.sprhib.dao;

import java.util.List;

import com.sprhib.model.Log;
import com.sprhib.model.Employee;

public interface LogDAO {
	
	public void addLog(Log log);
	public void updateLog(Log log);
	public Log getLog(int id);
	public Log getLog(Employee employee);
	public void deleteLog(int id);
	public List<Log> getLogs();

}
