package array.program;

public class PrintMaxAnsMinLengthElement {

	public static void main(String[] args) {
		String s[]= {"hi","hello","one","four","killer","abcdef"};
		int max=s[0].length();
		int min=s[0].length();
		
		//max
		for (int i = 1; i < s.length; i++) {
			if(max < s[i].length())
			{
				max=s[i].length();
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==max)
			{
				System.out.println(s[i]);
			}	
		}
		//min
		for (int i = 1; i < s.length; i++) {
			if(min > s[i].length())
			{
				min=s[i].length();
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==min)
			{
				System.out.println(s[i]);
			}	
		}
	}

}
