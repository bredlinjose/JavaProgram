package training.assesment;

interface Location{
	String country ="India";
	public void display();
}

abstract class LocationFix implements Location{
	public abstract void display();
}

class Atm extends LocationFix{
	private double money =70000.00;

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	@Override
	public void display() {
		System.out.println("ATM is in BTM Layout");
	}
	
}

public class RealTime {

	public static void main(String[] args) {
		Atm a = new Atm();
		System.out.println(a.getMoney());
		a.setMoney(80000.0);
		System.out.println(a.getMoney());
		System.out.println(Location.country);
	}

}
