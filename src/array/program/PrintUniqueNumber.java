package array.program;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		int[] a= {4,1,4,2,0,2};
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] && i!=j)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
			
		}

	}

}
