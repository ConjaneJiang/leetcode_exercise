/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */
package com.leetcode.question_library.two_nums_add;

// 定义链表节点
class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		this.val = x;
	}

}

public class Solution1 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int i = 0;
		ListNode p = l1, q = l2;
		int firstNum = 0;
		while (p != null) {
			Double k = Math.pow(10, i++);
			int facto = k.intValue();
			firstNum = firstNum + p.val * facto;
			p = p.next;
		}

		int j = 0;
		int secondNum = 0;
		while (q != null) {
			Double k = Math.pow(10, j++);
			int facto = k.intValue();
			secondNum = secondNum + q.val * facto;
			q = q.next;
		}

		int resultNum = firstNum + secondNum;
		// 链表尾插法
		ListNode header, tailer;
		header = tailer = null;
		if (resultNum == 0) {
			header = new ListNode(0);
		}
		while (resultNum != 0) {
			int val = resultNum % 10;
			resultNum = resultNum / 10;
			if (tailer == null) {
				header = tailer = new ListNode(val);
			} else {
				ListNode node = new ListNode(val);
				tailer.next = node;
				tailer = node;
			}
		}
		return header;
	}

	public static void main(String[] args) {
		ListNode firstNode1 = new ListNode(9);
		firstNode1.next = null;

		ListNode firstNode2 = new ListNode(1);
		ListNode secondNode2 = new ListNode(9);
		ListNode thirdNode2 = new ListNode(9);
		firstNode2.next = secondNode2;
		secondNode2.next = thirdNode2;
		thirdNode2.next = null;

		Solution1 solution1 = new Solution1();
		solution1.addTwoNumbers(firstNode1, firstNode2);
	}
}
