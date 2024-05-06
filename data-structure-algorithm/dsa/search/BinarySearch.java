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
		int first = 0;
		int last = arr.length - 1;
		int mid;
		boolean flag= false;
		while (first <= last) {
			mid = (first + last) / 2;
			if (arr[mid] == key) {
				System.out.println("Found at " + mid);
				flag=true;
				break;
			} else if (arr[mid] < key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			} 
		}
		if (flag==false) {
			System.out.println("Element not found");
		}
	}

}
