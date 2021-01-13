package com.leetcode.question_library.no_repeat_longest_substring;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int end = 0, start = 0; end < n; end++) {
			char alpha = s.charAt(end);
			if (map.containsKey(alpha)) {
				start = Math.max(map.get(alpha), start);
			}
			ans = Math.max(ans, end - start + 1);
			map.put(s.charAt(end), end + 1);
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(Solution2.lengthOfLongestSubstring("bbbb"));
		System.out.println(Solution2.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(Solution2.lengthOfLongestSubstring("pwwkew"));
	}
}
