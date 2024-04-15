package array.program;

public class SecondMinimum {
	
	private static int secondMin(int[] arr) {
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) //Ascending order
				{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		return arr[1];
		
	}
	
	private static int secondMinWithoutBubbleShot(int[] arr) {
		int fmin =Integer.MAX_VALUE;
		int smin =Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<fmin) {
				smin =fmin;
				fmin = arr[i];
			}else if (arr[i]<smin) {
				smin=arr[i];
			}
		}
		
		return smin;
	}

	public static void main(String[] args) {
		int arr[]= {10,30,20,50,40};
		
		System.out.println(secondMin(arr));
		
		System.out.println(secondMinWithoutBubbleShot(arr));
		
	}

}
