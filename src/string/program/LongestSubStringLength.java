package string.program;

import java.util.HashSet;

public class LongestSubStringLength {
	
	public static int lengthLongestSubString(String str) {
		int len = str.length();
		int right = 0;
		int left = 0;
		int maxLength = 0;
		
		HashSet<Character> set = new HashSet<Character>();
		
		while(right < len) {
			if (!set.contains(str.charAt(right))) {
				set.add(str.charAt(right));
				maxLength = Math.max(maxLength, right-left+1);
				right++;
			} else {
				set.remove(str.charAt(left));
				left++;
			}
		}
		return maxLength;
		
	}

	public static void main(String[] args) {
		String str = "aabcadefeee";  // 6
		System.out.println(lengthLongestSubString(str));
	}

}
