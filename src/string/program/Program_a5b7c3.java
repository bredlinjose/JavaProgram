package string.program;

public class Program_a5b7c3 {
	
	private static void program(String str) {
	
			for (int i = 0; i < str.length(); i++) {
				if (Character.isAlphabetic(str.charAt(i))) {
					System.out.print(str.charAt(i));
				} else {
					int temp = Character.getNumericValue(str.charAt(i));
					for (int j = 1; j < temp; j++) {
						System.out.print(str.charAt(i - 1));
					}
				}
			}
		}
	public static void main(String[] args) {
		program("a5b7c3");
	}
}

