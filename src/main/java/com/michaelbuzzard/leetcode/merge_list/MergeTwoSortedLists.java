package com.michaelbuzzard.leetcode.merge_list;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode handler;
        if(l1.val < l2.val) {
            handler = l1;
            handler.next = mergeTwoLists(l1.next, l2);
        } else {
            handler = l2;
            handler.next = mergeTwoLists(l1, l2.next);
        }

        return handler;
    }
}
