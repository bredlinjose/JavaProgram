package training.objectclass;

public class HashCode {
	int id;
	
	public HashCode(int id) {
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	public static void main(String[] args) {
		HashCode code = new HashCode(20);
		System.out.println(code);
		System.out.println(code.hashCode());
	}

}
