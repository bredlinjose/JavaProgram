package training.oops.encapsulation;

public class Atm {
	private double money =50000.00;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
}

class User {

	public static void main(String[] args) {
		Atm a = new Atm();
		System.out.println(a.getMoney());
		a.setMoney(70000.0);
		System.out.println(a.getMoney());

	}

}