package string.program;

public class AddOnlyNumbersInString {

	public static void main(String[] args) {
		String str="a1b3d4"; //1+3+4 //o/p 8
		
		int num=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9' ) {
				int n=str.charAt(i)-48;
				num=num+n;
			}
		}
		System.out.println(num);
		System.out.println();
		
		String s="a12bc11"; //12+11 //o/p 23
		int tsum=0; //1 12 0 0 1 11
		int sum=0; //12 12
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9' ) {
				int n1=s.charAt(i)-48; 
				tsum=tsum*10+n1;
			}else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum; //12+11=23
		System.out.println(sum); //23
	}

}
