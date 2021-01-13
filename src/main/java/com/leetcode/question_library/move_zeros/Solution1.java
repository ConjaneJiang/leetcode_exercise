/**
 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
 */
package com.leetcode.question_library.move_zeros;

import java.util.Arrays;

public class Solution1 {
	public static void moveZeroes(int[] nums) {
		int len = nums.length;
		int i = 0;
		while (i < len) {
			int temp = nums[i];
			if (temp == 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] != 0) {
						int val = nums[j];
						nums[j] = nums[i];
						nums[i] = val;
						break;
					}
				}
				i++;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 0, 1 };
		Solution1.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
}
