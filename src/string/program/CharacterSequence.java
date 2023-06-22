package string.program;

public class CharacterSequence {

	public static void main(String[] args) {
		String s="bredlin";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			s1=s1+s.charAt(i);
			System.out.println(s1);
		}
	}

}
