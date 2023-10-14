package training.objectclass;

public class ToString {

	int id;
	String name;
	
	public ToString(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		ToString std = new ToString(101, "Bredlin");
		System.out.println(std); // without toString method we will get address
		System.out.println(std.hashCode());
	}

}
