package com.sprhib.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhib.model.Vehicle;

@Repository
public class VehicleDAOImpl implements VehicleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addVehicle(Vehicle vehicle) {
		getCurrentSession().save(vehicle);
	}

	public void updateVehicle(Vehicle vehicle) {
		Vehicle vehicleToUpdate = getVehicle(vehicle.getId());
		vehicleToUpdate.setMake(vehicle.getMake());
		vehicleToUpdate.setModel(vehicle.getModel());
		vehicleToUpdate.setYear(vehicle.getYear());
		vehicleToUpdate.setMileage(vehicle.getMileage());
		vehicleToUpdate.setPlate(vehicle.getPlate());
		getCurrentSession().update(vehicleToUpdate);
		
	}

	public Vehicle getVehicle(int id) {
		Vehicle vehicle = (Vehicle) getCurrentSession().get(Vehicle.class, id);
		return vehicle;
	}

	public void deleteVehicle(int id) {
		Vehicle vehicle = getVehicle(id);
		if (vehicle != null)
			getCurrentSession().delete(vehicle);
	}

	@SuppressWarnings("unchecked")
	public List<Vehicle> getVehicles() {
		return getCurrentSession().createQuery("from Vehicle").list();
	}

}
