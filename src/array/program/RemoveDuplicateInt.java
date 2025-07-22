package array.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInt {
	
	/*
	 *  Time Complexity: O(n)
	 *  Space Complexity: O(n)
	 *  
	 */
	public static List<Integer> removeDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        return new ArrayList<Integer>(set);
    }
    
	
	/*
	 *  Time Complexity: O(n)
	 *  Space Complexity: O(n)
	 *  
	 */
    public static List<Integer> removeDuplicateUsingStream(int[] nums) {
        return Arrays.stream(nums)
        		.distinct()
        		.boxed()
        		.collect(Collectors.toList());
    }
    
    
    public static void main(String[] args) {
        
    	int[] nums = {2, 5, 1, 7, 8, 3, 2, 7};
        
        System.out.println(removeDuplicate(nums));
        
        System.out.println(removeDuplicateUsingStream(nums));
    }

}
