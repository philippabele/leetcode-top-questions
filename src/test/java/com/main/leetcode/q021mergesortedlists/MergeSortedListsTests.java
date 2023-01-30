package com.main.leetcode.q021mergesortedlists;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
 * class Solution {
 * public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
 * 
 * }
 * }
 */

public class MergeSortedListsTests {

    public boolean compareListNode(ListNode ln1, ListNode ln2) {

        while (true) {
            if (ln1.val == ln2.val && ln1.next != null && ln2.next != null) {
                ln1 = ln1.next;
                ln2 = ln2.next;
            } else if (ln1.val == ln2.val && ln1.next == null && ln2.next == null) {
                return true;
            } else {
                return false;
            }

        }
    }

    @Test
    public void exampleOne() {

        ListNode listnode13 = new ListNode(4);
        ListNode listnode12 = new ListNode(2, listnode13);
        ListNode listnode11 = new ListNode(1, listnode12);

        ListNode listnode23 = new ListNode(4);
        ListNode listnode22 = new ListNode(3, listnode23);
        ListNode listnode21 = new ListNode(1, listnode22);

        ListNode listnode36 = new ListNode(4);
        ListNode listnode35 = new ListNode(4, listnode36);
        ListNode listnode34 = new ListNode(3, listnode35);
        ListNode listnode33 = new ListNode(2, listnode34);
        ListNode listnode32 = new ListNode(1, listnode33);
        ListNode listnode31 = new ListNode(1, listnode32);

        ListNode result = MergeSortedLists.mergeTwoLists(listnode11, listnode21);

        assertTrue(compareListNode(result, listnode31));

    }

}
