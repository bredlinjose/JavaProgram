package string.program;

public class SumOfSequence {

	public static void main(String[] args) {
		String str = "bfh253jd94dj3";
		System.out.println(sumOfSingleDigit(str));
		System.out.println(printNumSequence(str));
		System.out.println(sumOfSequenceNum(str));
		
	}

	public static int sumOfSingleDigit(String nameString) {
		int num = 0;
		for (int i = 0; i < nameString.length(); i++) {
			char ch = nameString.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int n = ch - 48;
				num = num + n;
			}
		}
		return num;
	}

	public static int printNumSequence(String nameString) {
		int tsum = 0;
		for (int i = 0; i < nameString.length(); i++) {
			char ch = nameString.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int n = ch - 48;
				tsum = tsum * 10 + n;
			}
		}
		return tsum;
	}

	public static int sumOfSequenceNum(String nameString) {

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
		return tsum;
	}

}
