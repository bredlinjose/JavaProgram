package insta;

public class Program6 {

	public static void main(String[] args) {
		System.out.println(Program6.name());
		
	}public static int name() {
		try {
			return 8;
		} catch (Exception e) {
			System.out.println("Arithmetic Exception");
		}
		return 6;
	}
}
