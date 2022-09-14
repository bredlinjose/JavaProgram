package string.program;

public class VowelsInString {

	public static void main(String[] args) {
		String str="testing is done";
		String s=str.toLowerCase();
		char ch[]= s.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		/*
		int vowels=0;
		for(int i=0;i<str.length();i++) {
			char ch =s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}			
		}
		System.out.println(vowels);
		*/
	}
}
