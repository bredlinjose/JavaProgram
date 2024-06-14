package predefined_functional_interface.predicate_interface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	int experience;
	public Employee(String name, int sal, int exp) {
		ename = name;
		salary = sal;
		experience = exp;
	}
}

public class Predicate_ObjectsType {

	public static void main(String[] args) {
		
		//emp obj ---> return name if the sal> 30k and exp>3
		Predicate<Employee> pr = e->(e.salary>30000 && e.experience>3);
		Employee emp = new Employee("John", 50000, 5);
		
		if (pr.test(emp)) {
			System.out.println(emp.ename);
		}

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("John", 50000, 5));
		list.add(new Employee("David", 20000, 2));
		list.add(new Employee("Scott", 30000, 3));
		list.add(new Employee("Joe", 50000, 6));
		
		for (Employee employee : list) {
			if (pr.test(employee)) {
				System.out.println(employee.ename);
			}
		}

	}

}
