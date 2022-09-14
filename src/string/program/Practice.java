package string.program;

public class Practice {

	public static void main(String[] args) {
//		String s="bredlin";
//		for (int i = s.length()-1; i >=0; i--) {
//			System.out.println(s.charAt(i));
//		}
		
		String s="bredlin";
		String rev="";
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
	}

}
