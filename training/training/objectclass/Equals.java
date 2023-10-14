package training.objectclass;

// by default compare hascode value of the two objects
public class Equals {
	int id;
	String name;
	public Equals(int id, String name) {
		this.id = id;
		this.name= name;
	}
	
	

	@Override
	public int hashCode() {
		return name.hashCode();
	}



	@Override
	public boolean equals(Object o) {
		Equals e = (Equals)o;
		// here we are changing the implementation
		return this.name==e.name;
	}



	public static void main(String[] args) {
		Equals e = new Equals(20, "Smith");
		System.out.println(e.hashCode());
		
		Equals e1 = new Equals(20, "Allen");
		System.out.println(e1.hashCode());
		
		System.out.println(e1.equals(e));
		
		Equals e2 = new Equals(67, "Allen");
		System.out.println(e1.equals(e2));
		
		Equals e3 = new Equals(20, "Smith");
		System.out.println(e3.hashCode());
		
	}

}
