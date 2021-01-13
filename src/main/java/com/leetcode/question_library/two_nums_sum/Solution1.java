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

class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[] {};
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == nums[i] + nums[j]) {
					result = new int[] { i, j };
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		int[] nums = new int[] { 2, 6, 8, 9, 10 };
		int target = 11;
		int[] result = solution.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}
}
