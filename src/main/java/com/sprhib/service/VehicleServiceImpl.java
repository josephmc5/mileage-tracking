package com.sprhib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sprhib.dao.VehicleDAO;
import com.sprhib.model.Vehicle;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	private VehicleDAO vehicleDAO;

	public void addVehicle(Vehicle vehicle) {
		vehicleDAO.addVehicle(vehicle);		
	}

	public void updateVehicle(Vehicle vehicle) {
		vehicleDAO.updateVehicle(vehicle);
	}

	public Vehicle getVehicle(int id) {
		return vehicleDAO.getVehicle(id);
	}

	public void deleteVehicle(int id) {
		vehicleDAO.deleteVehicle(id);
	}

	public List<Vehicle> getVehicles() {
		return vehicleDAO.getVehicles();
	}

}
