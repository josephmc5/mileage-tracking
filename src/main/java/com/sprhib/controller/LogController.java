package com.sprhib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.model.Log;
import com.sprhib.service.LogService;

@Controller
@RequestMapping(value="/log")
public class LogController {
	
	@Autowired
	private LogService logService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addLogPage() {
		ModelAndView modelAndView = new ModelAndView("add-log-form");
		modelAndView.addObject("log", new Log());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingLog(@ModelAttribute Log log) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		logService.addLog(log);
		
		String message = "Log was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfLogs() {
		ModelAndView modelAndView = new ModelAndView("list-of-logs");
		
		List<Log> logs = logService.getLogs();
		modelAndView.addObject("logs", logs);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editLogPage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("edit-log-form");
		Log log = logService.getLog(id);
		modelAndView.addObject("log",log);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView editingLog(@ModelAttribute Log log, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		logService.updateLog(log);
		
		String message = "Log was successfully edited.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteLog(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		logService.deleteLog(id);
		String message = "Log was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
