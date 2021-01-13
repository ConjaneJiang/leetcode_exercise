/**
 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

示例 1:

输入: [1,2,3]
输出: [1,2,4]
解释: 输入数组表示数字 123。
示例 2:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。
 */
package com.leetcode.question_library.plus_one;

import java.util.Arrays;

public class Solution2 {

	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		for (int i = 0; i < digits.length; i++) {
			digits[len - 1 - i]++;
			digits[len - 1 - i] = digits[len - 1 - i] % 10;
			if (digits[len - 1 - i] != 0) {
				return digits;
			}
		}
		digits = new int[len + 1];
		digits[0] = 1;

		return digits;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(Solution2.plusOne(new int[] { 1, 2, 3, 4 })));
	}
}
