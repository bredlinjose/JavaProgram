package array.program;


public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int first = 0;
		int last = arr.length-1;
		int mid;
		int key = 7;
		boolean flag = false;
		
		while (first<=last) {
			mid= (first+last)/2;
			if(arr[mid]==key) {
				System.out.println("Found at "+ mid);
				flag= true;
				break;
			}else if (first<mid) {
				first = mid + 1;
			}else {
				last = mid -1;
			}
		}
		
		if (flag==false) {
			System.out.println("Not found");
		}
		

	}

}
