package array.program;

public class FirstMaximum {
	
	private static int firstMaxWithoutBubbleShot(int arr[]) {
		int max=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	private static int firstMax(int arr[]) {
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]<arr[j])  //Descending Order
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr[0];
	}


	public static void main(String[] args) {
		int arr[]= {10,30,20,50,40};
		System.out.println(firstMax(arr));
		
		System.out.println(firstMaxWithoutBubbleShot(arr));
		
	}

}
