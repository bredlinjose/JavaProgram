package array.program;

public class FirstMin {

	public static void main(String[] args) {
		int a[]= {10,30,20,50,40};
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) //Ascending order
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.print("First Minimum: "+ a[0]);
	}

}
