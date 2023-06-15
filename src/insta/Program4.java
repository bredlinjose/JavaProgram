package insta;

public class Program4 {

	public static void main(String[] args) {
		String wordString = "my name is bredlin";
		char[] arr = wordString.toCharArray();
		char[] result = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ' ') {
				result[i] = ' ';
			}
		}
		int num = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				if (result[num] == ' ') {
					num--;
				}
				result[num] = arr[i];
				num--;
			}
		}
		System.out.println(result);
	}
}
