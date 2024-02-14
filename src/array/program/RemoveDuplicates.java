package array.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int element : array) {
            uniqueSet.add(element);
        }

        // Convert the Set back to an array
        int[] resultArray = new int[uniqueSet.size()];
        int index = 0;
        for (int element : uniqueSet) {
            resultArray[index++] = element;
        }

        return resultArray;
    }
	
	public static int[] removeDuplicates1(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        Arrays.sort(array); // Sort the array

        int uniqueCount = 1; // Number of unique elements
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[uniqueCount++] = array[i];
            }
        }

        // Create a new array with unique elements
        int[] resultArray = Arrays.copyOf(array, uniqueCount);

        return resultArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 4};

        int[] arrayWithoutDuplicates = removeDuplicates(originalArray);
        int[] arrayWithoutDuplicates1 = removeDuplicates1(originalArray);

        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array without Duplicates: " + Arrays.toString(arrayWithoutDuplicates));
        System.out.println("Array without Duplicates: " + Arrays.toString(arrayWithoutDuplicates1));

    }

}
