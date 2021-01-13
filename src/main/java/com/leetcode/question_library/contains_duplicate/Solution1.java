/**
 给定一个整数数组，判断是否存在重复元素。

如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

示例 1:

输入: [1,2,3,1]
输出: true
示例 2:

输入: [1,2,3,4]
输出: false
示例 3:

输入: [1,1,1,3,3,4,3,2,4,2]
输出: true
 */
package com.leetcode.question_library.contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public static boolean containsDuplicate(int[] nums) {
		boolean flag = false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				flag = true;
			}
			map.put(nums[i], i);
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(Solution1.containsDuplicate(new int[] { 1, 2, 3, 4, 5 }));
	}
}
