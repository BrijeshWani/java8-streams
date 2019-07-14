package java8.streams.entities;

import java8.streams.constants.EmployeeDesignation;

public class Employee {
	private int id;
	private String name;
	private EmployeeDesignation designation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmployeeDesignation getDesignation() {
		return designation;
	}

	public void setDesignation(EmployeeDesignation designation) {
		this.designation = designation;
	}

}