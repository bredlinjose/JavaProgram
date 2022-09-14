package string.program;

public class ReverseTheGivenSentence {

	public static void main(String[] args) {
		String str="this is test yantra"; //o/p yantra test is this 
		String[] s=str.split(" ");
		for (int i = s.length-1; i>=0 ; i--) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		String str1="this is test yantra"; //o/p siht si tset artnay
		String[] s1=str.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String st1=s[i];
			for (int j = st1.length()-1; j >=0; j--) {
				System.out.print(st1.charAt(j));
			}
			System.out.print(" ");
		}

	}

}
