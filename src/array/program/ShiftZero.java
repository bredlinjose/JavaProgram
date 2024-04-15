package array.program;

import java.util.Arrays;

public class ShiftZero {
	
	 private static int[] moveZeros(int[] arr) {
			int[] res= new int[arr.length];
			int num=0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]!=0) {
					res[num]=arr[i];
					num++;
					
				}
			}
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==0) {
					res[num]=arr[i];
					num++;
				}
			}
			
			return res;
		}
	
	public static void main(String[] args) 
	{
		int arr[]= {3,0,0,5,1,0,2};
		
		int[] res = moveZeros(arr);
		System.out.println(Arrays.toString(res));
		
		
	}

}

