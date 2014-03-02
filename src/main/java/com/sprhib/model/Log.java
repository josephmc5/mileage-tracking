package com.sprhib.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import java.util.Date;

@Entity
@Table(name="log")
public class Log{
	
	@Id
	@Column(name = "log_id")
	@GeneratedValue
	private Integer id;
	
	private Date ctime;

	private Date logtime;

	private String description;

	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;

	public Log() {}

	public Log(Employee employee) {
		this.employee = employee;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
