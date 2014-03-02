package com.sprhib.service;

import java.util.List;

import com.sprhib.model.Log;

public interface LogService {
	
	public void addLog(Log log);
	public void updateLog(Log log);
	public Log getLog(int id);
	public void deleteLog(int id);
	public List<Log> getLogs();

}
