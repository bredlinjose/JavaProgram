package array.program;

import java.util.Arrays;

public class ReverseArray {
	 
	 private static int[] reverseArray(int[] arr) {
		 int length= arr.length;
		 int[] res= new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			res[length-1]=arr[i];
			length--;
		}
		
		return res;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] revArray= reverseArray(arr);
		System.out.println(Arrays.toString(revArray));
	}

}
