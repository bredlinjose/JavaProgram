package array.program;

public class SortDescendingOrder 
{
	public static void main(String[] args) 
	{
		int a[]= {10,30,20,50,40};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j])  //Descending Order
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
}
