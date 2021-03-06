/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数,并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
package com.leetcode.question_library.two_nums_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[] {};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				result = new int[] { map.get(diff), i };
			}
			map.put(nums[i], i);
		}
		return result;
	}

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int[] nums = new int[] { 3, 3 };
		int target = 6;
		int[] result = solution.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}
