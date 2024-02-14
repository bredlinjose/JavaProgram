package array.program;

import java.util.Arrays;

public class ShiftUsingKey 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int key=2; // expected output 3 4 5 1 2 
		for (int j = 0; j < key; j++)
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++) 
			{
				a[i-1]=a[i];	
			}
			a[a.length-1]=temp;	
		}
			System.out.print(Arrays.toString(a));
	}
}
