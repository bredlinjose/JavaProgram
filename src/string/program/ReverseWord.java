package string.program;

public class ReverseWord {

	public static void main(String[] args) {
		String str="india";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		/*
		String rev=" ";
		char ch;
		for(int i=0;i<str.length();i++)
		{	ch=str.charAt(i);
			rev=ch+rev;	
		}
		System.out.println(rev);		
	*/
	}

	}

