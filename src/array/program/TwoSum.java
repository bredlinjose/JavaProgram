package array.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

	private static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			int res = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (res == nums[j]) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { 0, 0 };
	}

	private static int[] twoSumUsingMap(int[] nums, int target) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 6, 11, 2, 15, 7 };
		int target = 9;
		// int[] res= twoSum(nums, target);

		int[] indexes = twoSumUsingMap(nums, target);
		System.out.println(Arrays.toString(indexes));
	}

}
