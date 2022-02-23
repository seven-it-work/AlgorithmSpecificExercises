package com.seven.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution142Date20220223Test {
    Solution142Date20220223 main;

    @BeforeEach
    void init() {
        main = new Solution142Date20220223();
    }

    @Test
    void case01() {
        Solution142Date20220223.ListNode node1 = new Solution142Date20220223.ListNode(3);
        Solution142Date20220223.ListNode node2 = new Solution142Date20220223.ListNode(2);
        Solution142Date20220223.ListNode node3 = new Solution142Date20220223.ListNode(0);
        Solution142Date20220223.ListNode node4 = new Solution142Date20220223.ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        Solution142Date20220223.ListNode result = main.detectCycle(node1);
        assertEquals(result, node2);
    }
    @Test
    void case02() {
        Solution142Date20220223.ListNode node1 = new Solution142Date20220223.ListNode(1);
        Solution142Date20220223.ListNode node2 = new Solution142Date20220223.ListNode(2);
        node1.next = node2;
        node2.next = node1;
        Solution142Date20220223.ListNode result = main.detectCycle(node1);
        assertEquals(result, node1);
    }
    @Test
    void case03() {
        Solution142Date20220223.ListNode node1 = new Solution142Date20220223.ListNode(1);
        Solution142Date20220223.ListNode result = main.detectCycle(node1);
        assertNull(result);
    }

}