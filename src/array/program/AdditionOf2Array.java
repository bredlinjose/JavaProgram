package array.program;

public class AdditionOf2Array 
{
	public static void main(String[] args) 
	{
		int a[]= {2,4,6,7};
		int b[]= {3,7,9};
		int length =a.length;
		if(a.length<b.length) 
		{
			length=b.length;
		}
		for(int i=0;i<length;i++) 
		{
			try {
			System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {
				if(a.length<b.length) 
				{
					System.out.println(b[i]);
				}
				else 
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}


