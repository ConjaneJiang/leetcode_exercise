package com.leetcode.question_library.two_arrays_intersection;

import java.util.Arrays;

public class Solution1 {

	public static int[] intersect(int[] nums1, int[] nums2) {
		int n1 = nums1.length;
		int n2 = nums2.length;
		if (n1 == 0 || n2 == 0) {
			return new int[] {};
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		// 用于便利两个数组
		int i = 0, j = 0;
		// 统计交集数量 先储存在nums1中 不开辟新空间
		int k = 0;
		while (i < n1 && j < n2) {
			if (nums1[i] == nums2[j]) {
				nums1[k++] = nums1[i];
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}
		return Arrays.copyOf(nums1, k);
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 2, 1 };
		int[] nums2 = new int[] { 2 };
		System.out.println(Arrays.toString(intersect(nums1, nums2)));
	}
}
