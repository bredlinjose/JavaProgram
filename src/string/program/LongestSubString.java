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
	
	public static String longestSubString(String str1, String str2) {
		// Brute Force
		int maxLen = 0;
	    String result = "";

	    for (int i = 0; i < str1.length(); i++) {
	        for (int j = i + 1; j <= str1.length(); j++) {
	            String substr = str1.substring(i, j);
	            if (str2.contains(substr) && substr.length() > maxLen) {
	                maxLen = substr.length();
	                result = substr;
	            }
	        }
	    }
	    return result;
	}

	public static void main(String[] args) {
		String str = "aabcadefeee";  
		System.out.println(longestSubString(str));  // bcadef
		
		String str1 = "abcdef";
		String str2 = "zcdefmf";
		System.out.println(longestSubString(str1, str2));  // cde
		
		
		System.out.println(str1.substring(0, 4));
	}

}
