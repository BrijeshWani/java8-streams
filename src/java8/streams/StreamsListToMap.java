package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.streams.constants.EmployeeDesignation;
import java8.streams.entities.Employee;

public class StreamsListToMap {
	public static void main(String[] args) {
		List<Employee> employees = getRandomEmployees();

		// List to map (id, employee_object)
		Map<Integer, Employee> employeeMap = employees.stream()
				.collect(Collectors.toMap(emp -> emp.getId(), emp -> emp));
		System.out.println("Employee id, employee_object map: " + employeeMap);

		// List to map (id, emplotyee_name)
		Map<Integer, String> employeeIdNameMap = employees.stream()
				.collect(Collectors.toMap(emp -> emp.getId(), Employee::getName));
		System.out.println("Employee id, name map: " + employeeIdNameMap);
	}

	public static List<Employee> getRandomEmployees() {
		List<Employee> employees = new ArrayList<>();

		Employee developerEmployee = new Employee();
		developerEmployee.setId(1);
		developerEmployee.setName("A");
		developerEmployee.setDesignation(EmployeeDesignation.DEVLOPER);
		employees.add(developerEmployee);

		Employee managerEmployee1 = new Employee();
		managerEmployee1.setId(2);
		managerEmployee1.setName("B");
		managerEmployee1.setDesignation(EmployeeDesignation.MANAGER);
		employees.add(managerEmployee1);

		Employee managerEmployee2 = new Employee();
		managerEmployee2.setId(3);
		managerEmployee2.setName("C");
		managerEmployee2.setDesignation(EmployeeDesignation.TEAM_LEAD);
		employees.add(managerEmployee2);

		return employees;
	}
}