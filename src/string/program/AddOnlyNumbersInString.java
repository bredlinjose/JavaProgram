package string.program;

public class AddOnlyNumbersInString {

	public static void main(String[] args) {
		sumOfSingleDigit("bfh253jd94dj3");
		printNumSequence("bfh253jd94dj3");
		sumOfSequenceNum("bfh253jd94dj3");
	}

	public static void sumOfSingleDigit(String nameString) {
		int num = 0;
		for (int i = 0; i < nameString.length(); i++) {
			char ch = nameString.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int n = ch - 48;
				num = num + n;
			}
		}
		System.out.println(num);
	}

	public static void printNumSequence(String nameString) {
		int tsum = 0;
		for (int i = 0; i < nameString.length(); i++) {
			char ch = nameString.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int n = ch - 48;
				tsum = tsum * 10 + n;
			}
		}
		System.out.println(tsum);
	}

	public static void sumOfSequenceNum(String nameString) {

		int tsum = 0;
		int sum = 0;
		for (int i = 0; i < nameString.length(); i++) {
			char ch = nameString.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int num = ch - 48;
				tsum = tsum * 10 + num;
			} else {
				sum = sum + tsum;
				tsum = 0;
			}
		}
		tsum = sum + tsum;
		System.out.println(tsum);
	}

}
