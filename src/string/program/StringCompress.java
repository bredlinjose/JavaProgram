package string.program;

public class StringCompress {
	
	private static String compressString(String str) {
		char[] arr = str.toCharArray();
		String comp = "";
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if((i+1)>=arr.length  || arr[i] !=arr[i+1]) {
				comp= comp+ arr[i];
				comp= comp+count;
				count=0;
			}
		}
		return comp;
		
	}

	public static void main(String[] args) {
		String st = "aaaaabbbbbbbbbbccc";
		System.out.println(compressString(st));

	}

}
