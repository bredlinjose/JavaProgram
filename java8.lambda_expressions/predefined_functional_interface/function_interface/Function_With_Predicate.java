package predefined_functional_interface.function_interface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

// Print the bonus if the bonus is greater than 5000
class Employee1 {
	String ename;
	int salary;

	public Employee1(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
}

public class Function_With_Predicate {

	public static void main(String[] args) {
		
		ArrayList<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1("David", 50000));
		list.add(new Employee1("John", 30000));
		list.add(new Employee1("Mary", 20000));

		Function<Employee1, Integer> fn = e -> {
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
		
		Predicate<Integer> p = b->b>5000;
		
		for (Employee1 employee : list) {
			int bonus = fn.apply(employee);
			if (p.test(bonus)) {
				System.out.println(employee.ename +" bonus is "+bonus);
			}
		}	
	}

}
