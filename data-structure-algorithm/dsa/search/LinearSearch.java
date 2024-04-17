package dsa.search;

/**
 * <b>Linear Search:</b>
 * 
 * Finding location of an element. Array should not follows any order. It will
 * check each and every element from the 1st index. Takes more time if the
 * element is at the last.
 * 
 * @Time_Complexity O(n)
 * @Space_Complexity O(1)
 */
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 8, 6, 9, 7 };
		int key = 11;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				flag = true;
				System.out.println(key + " is in index " + i);
			}
		}
		if (flag == false) {
			System.out.println("Key is not present in the array");
		}
	}

}
