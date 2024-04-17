package dsa.search;

/**
 * <b>Binary Search:</b>
 * 
 * Finding location of an element. Array should be in sorted order. Divide and
 * conquer. Reducing search space.
 * 
 * @Time_Complexity O(log n)
 * @Space_Complexity O(1)
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int key = 20;
		int left = 0;
		int right = arr.length - 1;
		int mid;
		boolean flag= false;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == key) {
				System.out.println("Found at " + mid);
				flag=true;
				break;
			} else if (arr[mid] < key) {
				left = mid + 1;
			} else {
				right = mid - 1;
			} 
		}
		if (flag==false) {
			System.out.println("Element not found");
		}
	}

}
