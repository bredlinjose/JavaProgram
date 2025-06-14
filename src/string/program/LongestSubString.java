package string.program;

import java.util.HashSet;

public class LongestSubString {
	
	public static String longestSubString(String str) {
		int len = str.length();
		int right = 0;
		int left = 0;
		int maxLength = 0;
		int x = 0;
		
		HashSet<Character> set = new HashSet<Character>();
		
		while(right < len) {
			if (!set.contains(str.charAt(right))) {
				set.add(str.charAt(right));
				
				if (right-left+1 > maxLength) {
					maxLength = right-left+1;
					x = left;
				}
				
				right++;
			} else {
				set.remove(str.charAt(left));
				left++;
			}
		}
		return str.substring(x, x+maxLength);
	}
	
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
		String str = "";
		lengthLongestSubString(str);
	}

}
