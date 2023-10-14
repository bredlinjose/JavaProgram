package training.oops.inheritance;

public class Inheritance_Hierarchical {

	public static void main(String[] args) {
		Savings s = new Savings();
		s.accNo=84685402074l;
		s.deposit(500.0);
		System.out.println("Balance Amount: "+s.bal);
		s.calculateRoi();
		
		System.out.println("========================");
		
		Current c = new Current();
		c.accNo=9568548764l;
		c.deposit(6500.0);
		c.withdraw(500);
		System.out.println("Balance Amount: "+c.bal);
		c.withdraw(2000);
		System.out.println("Balance Amount: "+c.bal);
	}

}
class Account{
	long accNo ;
	double bal;
	public void deposit(double amount) {
		bal =bal+amount;
		
	}
	public void withdraw(double amount) {
		bal =bal-amount;
		
	}
}

class Savings extends Account1{
	double roi=0.05;
	public void calculateRoi() {
		bal =bal+bal*roi;
		System.out.println("Rate of Interest: "+bal);
		
	}
}

class Current extends Account1{
	double minBalace=5000.0;
	public void showMinBal() {
		System.out.println("Minimum Balance: "+minBalace);
		
	}
}