package array.program;

public class Random2 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5,7,10};
		//expected output 3 6 8 9
		for(int i=0;i<a.length-1;i++)
		{
		int n=a[i+1]-a[i];
		int count=1;
		while (n>1) 
		{
		System.out.print(a[i]+count +" ");	
		count++;
		n--;
		}
		}

	}

}
