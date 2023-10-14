package training.assesment;

import java.util.Scanner;

public class Ola {
	String vehicle;
	String ac_nonAc;

	public Ola(String vehicle, String ac_nonAc) {
		this.vehicle = vehicle;
		this.ac_nonAc = ac_nonAc;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the vehicle name: ");
		String vehicle = scanner.nextLine();

		System.out.println("AC or Non AC");
		String ac_nonAc = scanner.nextLine();

		Ola ola = new Ola(vehicle, ac_nonAc);
		ola.vehicleType();

	}

	public void vehicleType() {
		if (ac_nonAc.equals("AC")) {
			System.out.println("Vehicle " + vehicle + " is " + ac_nonAc);
		} else if (ac_nonAc.equals("Non AC")) {
			System.out.println("Vehicle " + vehicle + " is " + ac_nonAc);
		} else {
			System.out.println("Invalid selection");
		}
	}

}