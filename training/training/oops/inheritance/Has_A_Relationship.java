package training.oops.inheritance;

public class Has_A_Relationship {

	public static void main(String[] args) {
		Luxury_Car c = new Luxury_Car("BMW");
		System.out.println(c.getName());
		c.setName("Audi");
		System.out.println(c.getName());
		System.out.println(c.getE().getHp());

	}

}
class Luxury_Car{
	private String name;

	public Luxury_Car(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private Engine e = new Engine(1400);

	public Engine getE() {
		return e;
	}


	public void setE(Engine e) {
		this.e = e;
	}
}

class Engine{
	private double hp;

	public Engine(double hp) {
		super();
		this.hp = hp;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}
	
}


