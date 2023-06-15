package string.program;

public class ReverseString {
	static String name = "sreelatha";

	public static void main(String[] args) {
		reverse1();
		reverse2();
		reverse3();
	}

	public static void reverse1() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.reverse();
		System.out.println(builder);
	}

	public static void reverse2() {
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

	public static void reverse3() {
		String rev = "";
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev);
	}
}
