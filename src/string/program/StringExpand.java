package string.program;

public class StringExpand {
	
	private static void singleDigit(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			} else {
				int temp = Character.getNumericValue(str.charAt(i));
				for (int j = 1; j < temp; j++) {
					System.out.print(str.charAt(i - 1));
				}
			}
		}
	}
	
	private static String expandString(String str) {
		char[] arr = str.toCharArray();
		String exp="";
		for (int i = 0; i < arr.length; i++) {
			int num =0;
			if (Character.isDigit(arr[i])) {
				char ch= arr[i-1];
				for (int j = i; j < arr.length; j++) {
					if (Character.isDigit(arr[i])) {
						num = (num*10)+ arr[i]-48;
					}else {
						break;
					}
					i++;
				}
				for (int j = 0; j < num; j++) {
					exp= exp+ch;
				}
			}
		}
		return exp;
	}

	public static void main(String[] args) {
		String str = "a3b10c5";
		System.out.println(expandString(str));
	}
}
