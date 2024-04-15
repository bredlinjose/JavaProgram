package array.program;

public class SecondMaximum {
	 
	 private static int secondMaxWithoutBubbleShot(int[] arr) {
			int fmax =Integer.MIN_VALUE;
			int smax =Integer.MIN_VALUE;
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i]>fmax) {
					smax =fmax;
					fmax = arr[i];
				}else if (arr[i]>smax) {
					smax=arr[i];
				}
			}
			
			return smax;
		}
	 
	 private static int secondMax(int[] arr) {
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
			return arr[1];
	}

	public static void main(String[] args) {
		int[] arr= {5,4,7,1,9,3,6,2};
		int smax = secondMax(arr);
		System.out.println("Second Maximum value is: "+smax);
		
		System.out.println(secondMaxWithoutBubbleShot(arr));
	}

}
