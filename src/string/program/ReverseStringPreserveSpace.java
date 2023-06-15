package string.program;

public class ReverseStringPreserveSpace {
	// Function to reverse the string
	// and preserve the space position
	public static void main(String[] args)
	{
		String str = "my name";
		char[] input = str.toCharArray();
		char[] result = new char[input.length];

		// Mark spaces in result
		for (int i = 0; i < input.length; i++) {
			if (input[i] == ' ') {
				result[i] = ' ';
			}
		}

		// Traverse input string from beginning
		// and put characters in result from end
		int j = result.length - 1;
		for (int i = 0; i < input.length; i++) {
			// Ignore spaces in input string
			if (input[i] != ' ') {
				// ignore spaces in result.
				if (result[j] == ' ') {
					j--;
				}
				result[j] = input[i];
				j--;
			}
		}
		System.out.println(String.valueOf(result));
	}
}