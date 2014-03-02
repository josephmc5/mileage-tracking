package com.sprhib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sprhib.model.Vehicle;
import com.sprhib.service.VehicleService;

@Controller
@RequestMapping(value="/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addVehiclePage() {
		ModelAndView modelAndView = new ModelAndView("add-vehicle-form");
		modelAndView.addObject("vehicle", new Vehicle());
		return modelAndView;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView addingVehicle(@ModelAttribute Vehicle vehicle) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		vehicleService.addVehicle(vehicle);
		
		String message = "Vehicle was successfully added.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/list")
	public ModelAndView listOfVehicles() {
		ModelAndView modelAndView = new ModelAndView("list-of-vehicles");
		
		List<Vehicle> vehicles = vehicleService.getVehicles();
		modelAndView.addObject("vehicles", vehicles);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView editVehiclePage(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("edit-vehicle-form");
		Vehicle vehicle = vehicleService.getVehicle(id);
		modelAndView.addObject("vehicle",vehicle);
		return modelAndView;
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.POST)
	public ModelAndView editingVehicle(@ModelAttribute Vehicle vehicle, @PathVariable Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("home");
		
		vehicleService.updateVehicle(vehicle);
		
		String message = "Vehicle was successfully edited.";
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deleteVehicle(@PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("home");
		vehicleService.deleteVehicle(id);
		String message = "Vehicle was successfully deleted.";
		modelAndView.addObject("message", message);
		return modelAndView;
	}

}
