package array.program;

import java.util.Arrays;

public class ShiftZero 
{
	public static void main(String[] args) 
	{
		int a[]= {3,0,0,5,1,0,2};
		
		int b[]=new int[a.length];
		int n=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			{
				b[n++]=a[i];
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				b[n++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}

}

