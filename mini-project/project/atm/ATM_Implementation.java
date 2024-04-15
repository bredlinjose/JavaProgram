package project.atm;

import java.util.LinkedHashMap;
import java.util.Map;

public class ATM_Implementation implements ATM_Interface {

	ATM atm = new ATM();
	Map<Double, String> miniState = new LinkedHashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available Balance is: " + atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		
		if (withdrawAmount%100==0 || withdrawAmount%200==0 || withdrawAmount%500==0 ) {
			if (withdrawAmount <= atm.getBalance()) {
				System.out.println("Collect the Cash: " + withdrawAmount);
				atm.setBalance(atm.getBalance() - withdrawAmount);

				miniState.put(withdrawAmount,"Amount Withdrawn: ");

				viewBalance();
			} else {
				System.out.println("Insufficient Balance");
			}
		}else {
			System.out.println("Enter the amount which is multiple of 100, 200, 500");
		}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println("Amount: " + depositAmount + " Deposited Successfully");
		atm.setBalance(atm.getBalance() + depositAmount);

		miniState.put(depositAmount,"Amount Deposited: ");

		viewBalance();
	}

	@Override
	public void viewMiniStatement() {
		for (Map.Entry<Double, String> entry : miniState.entrySet()) {
			System.out.println(entry.getValue() + entry.getKey());
		}
	}

}
