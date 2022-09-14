package array.program;

public class Random3 
{
	public static void main(String[] args) 
	{
		int a[]= {3,0,0,5,1,0,2};
		/*
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		*/
		int b[]=new int[a.length];
		int n=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0)
			{
				b[n++]=a[i];
				System.out.print(a[i]+" ");
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0)
			{
				b[n++]=a[i];
				System.out.print(a[i]+" ");
			}
		}
		
	}

}

