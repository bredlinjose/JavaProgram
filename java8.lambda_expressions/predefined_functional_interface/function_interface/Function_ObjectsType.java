package predefined_functional_interface.function_interface;

import java.util.ArrayList;
import java.util.function.Function;

// find bonus
class Employee {
	String ename;
	int salary;

	public Employee(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
}

public class Function_ObjectsType {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("David", 50000));
		list.add(new Employee("John", 30000));
		list.add(new Employee("Mary", 20000));

		Function<Employee, Integer> fn = e -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 20000) {
				return (sal * 10 / 100); // 10%
			} else if (sal > 20000 && sal <= 30000) {
				return (sal * 20 / 100); // 20%
			} else if (sal > 30000 && sal <= 50000) {
				return (sal * 30 / 100); // 30%
			} else {
				return (sal * 40 / 100);
			}
		};
		for (Employee employee : list) {
			int bonus = fn.apply(employee);
			System.out.println(employee.ename +" bonus is "+bonus);
		}
		
	}

}
