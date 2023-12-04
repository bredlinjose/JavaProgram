package problemset.easy;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		int temp = x;
		int rem;
		int rev = 0;
		while (x>0) {
			rem = x%10;
			rev= rev*10+rem;
			x= x/10;
		}
		if (temp==rev) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		PalindromeNumber num = new PalindromeNumber();
		boolean bool = num.isPalindrome(121);
		System.out.println(bool);

	}

}
