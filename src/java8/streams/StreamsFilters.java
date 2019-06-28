package java8.streams;

import java.util.List;
import java.util.Optional;

import java8.streams.entities.Employee;

public class StreamsFilters {
	public static void main(String[] args) {

		// Streams with objects and filter
		List<Employee> employees = Employee.getRandomEmployees();
		Optional<Employee> employeeWithNameA = employees.parallelStream().filter(emp -> "SDF".equals(emp.getName()))
				.findFirst();
		if (employeeWithNameA.isPresent()) {
			employeeWithNameA.toString();
		} else {
			System.out.println("Employee not found.");
		}
	}
}
