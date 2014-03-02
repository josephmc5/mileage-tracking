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
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue
	private Integer id;
	
	private String firstName;

	private String lastName;
	
	private String phoneNumber;

	@OneToMany(orphanRemoval=true, cascade=CascadeType.ALL, mappedBy="employee")
	@JoinColumn(name="employee_id")
	private Set<Log> logs;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber= phoneNumber;
	}

	public Set<Log> getLogs() {
		return logs;
	}
}
