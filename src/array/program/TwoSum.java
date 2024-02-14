package array.program;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }

            numIndexMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 13, 11, 7};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target: [" + result[0] + ", " + result[1] + "]");
    }
}

