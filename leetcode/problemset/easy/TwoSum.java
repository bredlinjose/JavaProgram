package problemset.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	// One-pass Hash Table
	public int[] twoSum1(int[] nums, int target) {
		
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
			int complement = target-nums[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i], i);
		}
		return null;
    }
	
	// Brute Force
	 public int[] twoSum2(int[] nums, int target) {
	        int n = nums.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (nums[i] + nums[j] == target) {
	                    return new int[]{i, j};
	                }
	            }
	        }
	        return null;
	    }
	
	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		int[] indices = sum.twoSum1(new int[] {2,5,6,7,12,10}, 9);
		System.out.println(Arrays.toString(indices));
	}

}
