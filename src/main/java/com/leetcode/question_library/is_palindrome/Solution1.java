package com.leetcode.question_library.is_palindrome;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Solution1 {
    public boolean isPalindrome(int x){
        if (x < 0) return false;
        if (x == 0) return true;
        int i = -1;
        int sum = 0;
        int tempX = x;
        int quotient = x;
        /**
         * 计算有几位数
         */
        while (quotient != 0){
            i = i + 1;
            quotient = quotient / 10;
        }
        /**
         * 取出每一项的余数，然后进行乘以操作
         * 例如：1221 1*1000 + 2*100 + 2*10 + 1 = 1221
         * 例如：123 3*100 + 2*10 + 1 = 321
         */
        while (x != 0){
            int remainder = x % 10;
            x = x / 10;
            sum = (int)Math.pow(10,i) * remainder + sum;
            i = i - 1;
        }
        if (tempX == sum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isPalindrome(100));
    }
}
