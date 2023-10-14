package training.assesment;

public class Mobile {
	String brand;
	String colour;
	int price;
	

	public Mobile(String brand, String colour, int price) {
		this(brand, colour);
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		System.out.println("3 arguments");
	}
	
	public Mobile(String brand, String colour) {
		this(brand);
//		this.brand=brand;
//		this.colour= colour;
		System.out.println("2 arguments");

	}

	public Mobile(String brand) {
		//this.brand=brand;
		System.out.println("1 argument");

	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("Realme","Black",50000);
		System.out.println(m1.brand);
		
		
	}

}
