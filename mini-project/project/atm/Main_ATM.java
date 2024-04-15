package project.atm;

import java.util.Scanner;

public class Main_ATM {

	static int accountNumber= 98;
	static int accountPIN= 1234;
	
	static ATM_Interface opt = new ATM_Implementation();
	
	public static void main(String[] args) {
		System.out.println("Welcome to the ATM");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Account number: ");
		int accNum= sc.nextInt();
		System.out.print("Enter the PIN: ");
		int pin= sc.nextInt();

		if (accountNumber== accNum && accountPIN== pin) {
			System.out.println("Verification is done and the Customer Exists");
		}else {
			System.out.println("Incorrect Account number or PIN");
			System.exit(0);
		}

		while (true) {
			System.out.println("1. View Balance");
			System.out.println("2. Cash Withdraw");
			System.out.println("3. Cash Deposit");
			System.out.println("4. View Mini Statement");
			System.out.println("5. Exit");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				opt.viewBalance();
				
				break;
			case 2:
				System.out.print("Enter the Amount to Deposit: ");
				double depositAmount = sc.nextDouble();
				opt.depositAmount(depositAmount);
				
				break;
			case 3:
				System.out.println("Notes available 100, 200, 500");
				System.out.print("Enter the Amount to Withdraw: ");
				double withdrawAmount = sc.nextDouble();
				opt.withdrawAmount(withdrawAmount);
				
				break;
			case 4:
				opt.viewMiniStatement();
				
				break;
			case 5:
				System.out.println("Thank you for using the ATM");
				System.out.println("Have a good day");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		

	}

}
