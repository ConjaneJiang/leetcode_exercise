/**
给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

示例 1:
输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]

示例 2:
输入: [-1,-100,3,99] 和 k = 2
输出: [3,99,-1,-100]
解释: 
向右旋转 1 步: [99,-1,-100,3]
向右旋转 2 步: [3,99,-1,-100]
 */
package com.leetcode.question_library.rotate_array;

import java.util.Arrays;

public class Solution2 {
	public static void rotate(int[] nums, int k) {
		int len = nums.length;
		int[] rotateNums = new int[len];
		int j = 0;
		for (int i = 0; i < len; i++) {
			rotateNums[(i + k) % len] = nums[i];
		}
		for (int i = 0; i < len; i++) {
			nums[j++] = rotateNums[i];
		}

	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1 };
		Solution2.rotate(nums, 3);
		System.out.println(Arrays.toString(nums));
	}
}
