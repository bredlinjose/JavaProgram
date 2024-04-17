package dsa.sort;

import java.util.Arrays;

/**
 * <b>Bubble Sort:</b>
 * 
 * Sorting algorithm based on swapping. Compares adjacent element. Arrange
 * element in ascending order. Swapping is done with the help of temp/third
 * variable
 * 
 * @Time_Complexity O(n^2)
 * @Space_Complexity O(1)
 * 
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 4 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
