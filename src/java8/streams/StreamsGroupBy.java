package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.streams.constants.EmployeeDesignation;
import java8.streams.entities.Employee;

public class StreamsGroupBy {
	public static void main(String[] args) {
		List<Employee> employees = getRandomEmployees();

		// Group by name
		Map<String, List<Employee>> groupByName = employees.stream().collect(Collectors.groupingBy(Employee::getName));
		System.out.println("group by name -> employee_object: " + groupByName);

		Map<String, List<EmployeeDesignation>> groupByNameDesignation = employees.stream().collect(Collectors
				.groupingBy(Employee::getName, Collectors.mapping(Employee::getDesignation, Collectors.toList())));
		System.out.println("group by name -> List<EmployeeDesignation>: " + groupByNameDesignation);
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
