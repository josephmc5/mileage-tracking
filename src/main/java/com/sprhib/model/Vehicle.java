package com.sprhib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.Set;

@Entity
@Table(name="vehicle")
public class Vehicle {
	
	@Id
	@Column(name = "vehicle_id")
	@GeneratedValue
	private Integer id;
	
	private String make;

	private String model;
	
	private Integer year;

	private Integer mileage;

	private String plate;
	
	@OneToMany(orphanRemoval=true, cascade=CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Set<Log> logs;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Set<Log> getLogs() {
		return logs;
	}
}
