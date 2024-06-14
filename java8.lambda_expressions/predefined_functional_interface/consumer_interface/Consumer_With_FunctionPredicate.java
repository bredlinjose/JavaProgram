package predefined_functional_interface.consumer_interface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// calculate bonus, check bonus > 5000 and print emp name
class Employee {
	String ename;
	int salary;
	String gender;

	public Employee(String ename, int salary, String gender) {
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
}

public class Consumer_With_FunctionPredicate {

	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("David", 50000, "Male"));
		list.add(new Employee("John", 30000, "Male"));
		list.add(new Employee("Mary", 20000, "Female"));
		list.add(new Employee("Scott", 60000, "Male"));

		Function<Employee, Integer> fn = emp -> (emp.salary*10)/100; // task1
		
		Predicate<Integer> pr = b -> b>=5000; //task2
		
		Consumer<Employee> c = emp -> {
			System.out.println(emp.ename);
			System.out.println(emp.salary);
			System.out.println(emp.gender);
		}; //task3
		
		for (Employee e : list) {
			int bonus = fn.apply(e); 
			if (pr.test(bonus)) {
				c.accept(e);
				System.out.println(bonus);
			}
		}
	}

}
