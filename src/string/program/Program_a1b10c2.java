package string.program;

public class Program_a1b10c2 {

	public static void main(String[] args) {
		String str= "a11b10c2";
		char[] arr =str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			int num=0;
			if(Character.isDigit(arr[i])) {
				char temp= arr[i-1];
				for (int j = i; j < arr.length; j++) {
					if(Character.isDigit(arr[j])) {
						num = (num*10)+ arr[i]-48;
					}else
						break;
					i++;
				}
				
				for (int k = 0; k < num; k++) {
					System.out.print(temp);
				}	
			}
		}	
	}
}
