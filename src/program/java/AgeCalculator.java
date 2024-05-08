package program.java;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	private static int calculateAge(String dob) {
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.parse(dob);
		
		Period age = Period.between(birthDate, today);
		int year = age.getYears();
		
		return year;
	}

	public static void main(String[] args) {
		String dob = "1997-02-22";
		
		System.out.println(calculateAge(dob));
	}

}
