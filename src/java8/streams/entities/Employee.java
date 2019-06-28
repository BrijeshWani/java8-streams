package java8.streams.entities;

import java.util.ArrayList;
import java.util.List;

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

	public static List<Employee> getRandomEmployees() {
		List<Employee> employees = new ArrayList<>();

		Employee developerEmployee = new Employee();
		developerEmployee.setId(1);
		developerEmployee.setName("A");
		developerEmployee.setDesignation(EmployeeDesignation.DEVLOPER);
		employees.add(developerEmployee);

		Employee managerEmployee = new Employee();
		managerEmployee.setId(2);
		managerEmployee.setName("B");
		managerEmployee.setDesignation(EmployeeDesignation.MANAGER);
		employees.add(managerEmployee);

		return employees;
	}

	@Override
	public String toString() {
		System.out.println("Employee details: ");
		System.out.println("Id: " + this.getId());
		System.out.println("Name: " + this.getName());
		System.out.println("Designation: " + this.getDesignation());
		return "";
	}

}