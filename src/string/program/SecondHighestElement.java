package string.program;

public class SecondHighestElement {
	
	public static int secondLargestWithoutDuplicate(int[] arr) {

        int max = 0;
        int secondMax = 0;
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] > max) {
                secondMax = max;
                max = arr[i];	
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
		}
        return secondMax;
    }
	
	 public static void main(String[] args) {
	        int[] array = {12,10,5,7,12,3,8,9};
	        int secondLargest = secondLargestWithoutDuplicate(array);
	        System.out.println("Second largest element is " + secondLargest);

	    }
}
