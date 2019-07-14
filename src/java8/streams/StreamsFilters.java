package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java8.streams.constants.EmployeeDesignation;
import java8.streams.entities.Employee;

public class StreamsFilters {
	public static void main(String[] args) {

		// Streams with objects and filter
		List<Employee> employees = getRandomEmployees();
		Optional<Employee> employeeWithNameA = employees.parallelStream().filter(emp -> "SDF".equals(emp.getName()))
				.findFirst();
		if (employeeWithNameA.isPresent()) {
			employeeWithNameA.toString();
		} else {
			System.out.println("Employee not found.");
		}
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
		managerEmployee.setName("A");
		managerEmployee.setDesignation(EmployeeDesignation.MANAGER);
		employees.add(managerEmployee);

		return employees;
	}
}
