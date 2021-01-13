package com.leetcode.question_library.no_repeat_longest_substring;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

	public static int lengthOfLongestSubstring(String s) {
		int len = s.length();
		Set<Character> hashSet = new HashSet<Character>();
		int ans = 0, i = 0, j = 0;
		while (i < len && j < len) {
			if (!hashSet.contains(s.charAt(j))) {
				hashSet.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				hashSet.remove(s.charAt(i++));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(Solution1.lengthOfLongestSubstring("bbbb"));
		System.out.println(Solution1.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(Solution1.lengthOfLongestSubstring("pwwkew"));
	}
}
