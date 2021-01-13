package com.leetcode.question_library.delete_repeat_item_from_array;

public class Solution1 {
	public static int removeDuplicates(int[] nums) {

		int cur = 0;
		for (int pre = 0; pre < nums.length; pre++) {
			if (nums[cur] != nums[pre]) {
				cur++;
				nums[cur] = nums[pre];
			}
		}
		return ++cur;
	}

	public static void main(String[] args) {
		System.out.println(Solution1.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
	}

}
