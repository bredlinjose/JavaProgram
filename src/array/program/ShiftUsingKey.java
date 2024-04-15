package array.program;

import java.util.Arrays;

public class ShiftUsingKey {
	
	private static String shift(int[] arr, int key) {
		int[] result = new int[arr.length];
		int count =0;
		for(int i=key; i<arr.length; i++) {
			result[count]= arr[i];
			count++;
		}
		
		for (int i = 0; i < key; i++) {
			result[count]= arr[i];
			count++;
		}
		return Arrays.toString(result);
	}
	
	private static String shift(int key,int[] arr) {
		for (int j = 0; j < key; j++)
		{
			int temp=arr[0];
			for(int i=1;i<arr.length;i++) 
			{
				arr[i-1]=arr[i];	
			}
			arr[arr.length-1]=temp;	
		}
			return Arrays.toString(arr);
	}
	
	public static void main(String[] args) 
	{
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		System.out.println(shift(arr,3));
		
		System.out.println(shift(5, arr));
		
		
	}
}
