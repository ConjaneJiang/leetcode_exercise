/**
 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

示例 1:

输入: [2,2,1]
输出: 1
示例 2:

输入: [4,1,2,1,2]
输出: 4
 */
package com.leetcode.question_library.only_appear_one_time_number;

import java.util.Arrays;

public class Solution1 {

	public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		int singleNumber = nums[len - 1];
		for (int i = 1; i < len - 1; i++) {
			if (nums[0] != nums[1]) {
				singleNumber = nums[0];
				break;
			} else if (nums[len - 1] != nums[len - 2]) {
				singleNumber = nums[len - 1];
				break;
			} else if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
				singleNumber = nums[i];
				break;
			}
		}
		return singleNumber;
	}

	public static void main(String[] args) {
		System.out.println(Solution1.singleNumber(new int[] { 2, 2, 1 }));
	}
}
