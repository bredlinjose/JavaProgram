package array.program;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {3,4,5,6,7,8,9,10,11};
		for(int i=0;i<a.length;i++)
		{
			int n=a[i];
			int count=2;
			while(true)
			{
				if(n%count==0)
				{
					break;
				}
				else
				{
					count++;
				}
			}
			if(count==n)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
