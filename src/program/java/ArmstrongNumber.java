package program.java;

public class ArmstrongNumber {
//a number that equals the sum of its digits, each raised to a power
	
	public static void main(String[] args) {
		System.out.println(checkArmstrong(371));

	}
	
	private static String checkArmstrong(int num) {
		
		int temp=num;
		int digit = 0;
		int sum = 0;
		int last = 0;
		
		while (temp>0) {
			temp= temp/10;
			digit++;
		}
		
		temp=num;
		while (temp>0) {
			last= temp%10;
			sum += (Math.pow(last, digit));
			temp= temp/10;
		}
	
		if (num==sum) {

			return "Armstrong number";
		} else {

			return "Not Armstrong number";
		}
	}

}
