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

//该方法出现整型溢出
public class Solution1 {
	public static int[] plusOne(int[] digits) {
		int sum = 0;
		int k = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += digits[digits.length - 1 - i] * Math.pow(10, k++);
		}
		sum += 1;
		String[] strArrays = String.valueOf(sum).split("");
		int[] resultArray = new int[strArrays.length];
		for (int i = 0; i < strArrays.length; i++) {
			resultArray[i] = Integer.valueOf(strArrays[i]);
		}
		return resultArray;
	}

	public static void main(String[] args) {
		Solution1.plusOne(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 });
	}
}
