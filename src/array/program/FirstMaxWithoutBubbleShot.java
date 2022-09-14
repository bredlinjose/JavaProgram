package array.program;

public class FirstMaxWithoutBubbleShot 
{
	public static void main(String[] args) 
	{
		int a[]= {20,30,10,50,40};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
