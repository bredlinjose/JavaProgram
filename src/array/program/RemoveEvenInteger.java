package array.program;

import java.util.Arrays;

public class RemoveEvenInteger {

	private static int[] removeEvenNum(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		int result[] = new int[count];
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[x] = arr[i];
				x++;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 7, 1, 9, 3, 6, 2 };
		int[] odd = removeEvenNum(arr);
		System.out.println("Array without even: " + Arrays.toString(odd));

	}

}
