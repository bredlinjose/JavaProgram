package array.program;

import java.util.Arrays;

public class FlatTheArray {

	    public static int[] flattenArray(int[][] inputArray) {
	        int totalElements = 0;

	        // Count the total number of elements in the 2D array
	        for (int[] row : inputArray) {
	            totalElements += row.length;
	        }

	        // Create a new 1D array to store the flattened elements
	        int[] resultArray = new int[totalElements];

	        // Copy elements from the 2D array to the 1D array
	        int index = 0;
	        for (int[] row : inputArray) {
	            for (int element : row) {
	                resultArray[index++] = element;
	            }
	        }

	        return resultArray;
	    }

	    public static void main(String[] args) {
	        int[][] inputArray = {
	            {1, 2, 3},
	            {4, 5},
	            {6, 7, 8}
	        };

	        int[] flattenedArray = flattenArray(inputArray);

	        System.out.println("Flattened Array: " + Arrays.toString(flattenedArray));
	    }
	}
