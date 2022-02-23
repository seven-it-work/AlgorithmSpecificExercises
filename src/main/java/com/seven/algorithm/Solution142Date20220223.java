package com.seven.algorithm;

import java.util.HashSet;

public class Solution142Date20220223 {
    /**
     * 执行用时：3 ms, 在所有 Java 提交中击败了21.34%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了5.05%的用户
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = head;
        HashSet<ListNode> temp = new HashSet<>();
        while (next.next != null) {
            if (temp.contains(next)) {
                return next;
            } else {
                temp.add(next);
            }
            next = next.next;
        }
        return null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
