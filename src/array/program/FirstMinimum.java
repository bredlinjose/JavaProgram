package array.program;

import java.util.Arrays;

public class FirstMinimum {
	
	private static int firstMinWithoutBubbleShot(int[] arr) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}
	
	private static int firstMin(int[] arr) {
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) //Ascending order
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr[0];
	}
	
	private static int firstMinUsingSort(int[] arr) {
		Arrays.sort(arr);
		
		return arr[0];
	}

	public static void main(String[] args) {
		int arr[]= {10,30,20,50,40};
		
		System.out.println(firstMinWithoutBubbleShot(arr));
		
		System.out.println(firstMin(arr));
		
		System.out.println(firstMinUsingSort(arr));
		
	}

}
