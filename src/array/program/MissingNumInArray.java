package array.program;

public class MissingNumInArray 
{

	public static void main(String[] args) 
	{
		int a[] = { 1, 2, 5, 7, 10, 12, 15 };
		for (int i = 0; i < a.length-1; i++) {
			int diff = a[i+1]- a[i];
			int count=1;
			while (diff>1) {
				System.out.print(a[i]+count +" ");
				count++;
				diff--;
			}
		}

	}

}
