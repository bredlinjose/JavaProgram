package training.oops.inheritance;

public class Inheritance_Hierarchical2 {

	public static void main(String[] args) {
		Account1 a = new Current1();
		a.accNo =565325763298471l;
		a.deposit(8500.0);
		System.out.println(a.bal);
		a.withdraw(3500.0);
	}

}
class Account1{
	long accNo ;
	double bal;
	public void deposit(double amount) {
		bal =bal+amount;
		
	}
	public void withdraw(double amount) {
		bal =bal-amount;
		
	}
}

class Savings1 extends Account1{
	double roi=0.05;
	public void calculateRoi() {
		bal =bal+bal*roi;
		System.out.println("Rate of Interest: "+bal);
		
	}
}

class Current1 extends Account1{
	double minBalace=5000.0;
	
	@Override
	public void withdraw(double amount) {
		if (bal-amount>=minBalace) {
			bal= bal-amount;
			System.out.println(bal);
		} else {
			System.out.println("Insufficent Amount");
		}
	}
	
	public void showMinBal() {
		System.out.println("Minimum Balance: "+minBalace);
		
	}
}