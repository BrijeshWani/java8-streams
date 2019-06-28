package java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java8.streams.entities.Employee;

public class ListToMap {
	public static void main(String[] args) {
		List<Employee> employees = Employee.getRandomEmployees();

		// List to map (id, name)
		Map<Integer, String> employeeMap = employees.stream()
				.collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getName()));
		System.out.println(employeeMap);
	}
}