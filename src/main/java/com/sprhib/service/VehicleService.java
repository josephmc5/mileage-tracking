package com.sprhib.service;

import java.util.List;

import com.sprhib.model.Vehicle;

public interface VehicleService {
	
	public void addVehicle(Vehicle vehicle);
	public void updateVehicle(Vehicle vehicle);
	public Vehicle getVehicle(int id);
	public void deleteVehicle(int id);
	public List<Vehicle> getVehicles();

}
