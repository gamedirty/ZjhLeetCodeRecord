package com.gamedirty.java.solutions;

import com.gamedirty.java.datastructure.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Add2NumberSolution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        int a = l1.val;
        int b = l2.val;
        listNode.val = a + b;
        while (l1.next != null && l2.next != null) {
            listNode.next = new ListNode(l1.next.val + l2.next.val);
        }
        return listNode;
    }
}
