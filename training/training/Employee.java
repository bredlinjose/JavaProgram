package training;

public class Employee {
	
	String eName ="Bredlin";
	int eId = 101;
	double sal = 1000.0;
	static String company ="TYSS";
	
	public void updateSal(double inc) {
		sal = sal + inc;
		System.out.println("Sal after increment "+ sal);
	}
	public static void showCompanyName() {
		System.out.println(company);
	}
	

	public static void main(String[] args) {
		showCompanyName();
		new Employee().updateSal(500.0);
		

	}

}
