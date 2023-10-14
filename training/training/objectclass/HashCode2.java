package training.objectclass;

public class HashCode2 {
	int id;
	String name;
	public HashCode2(int id, String name) {
		this.id = id;
		this.name= name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	public static void main(String[] args) {
		HashCode2 code = new HashCode2(20, "Smith");
		System.out.println(code.hashCode());
		
		HashCode2 code1 = new HashCode2(20, "Allen");
		System.out.println(code1.hashCode());
		
		HashCode2 code2 = new HashCode2(20, "Smith");
		System.out.println(code2.hashCode());
		
		HashCode2 code3 = new HashCode2(30, "Smith");
		System.out.println(code3.hashCode());
		
	}

}
