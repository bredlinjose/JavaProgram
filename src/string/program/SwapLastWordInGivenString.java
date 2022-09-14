package string.program;

public class SwapLastWordInGivenString {

	public static void main(String[] args) {
		String str="this is test yantra"; 
		String[] s=str.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		
	}

}
