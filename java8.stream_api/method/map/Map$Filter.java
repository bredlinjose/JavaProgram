package method.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empid;
	String empname;
	int salary;

	public Employee(int empid, String empname, int salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

}

/*
 * print salary of the employee >20000 and print the salary of all employee
 * first filter next map
 */
public class Map$Filter {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee(101, "Alex", 10000), new Employee(102, "Brian", 20000),
				new Employee(103, "Charles", 30000), new Employee(104, "David", 40000),
				new Employee(105, "Edward", 50000));

		List<Integer> sal = employeeList.stream()
				.filter(e -> e.salary > 20000)
				.map(e -> e.salary)
				.collect(Collectors.toList());
		System.out.println(sal);

		employeeList.stream()
		.filter(e -> e.salary > 20000)
		.map(e -> e.salary).forEach(System.out::println);
	}

}
