package round03;

import common.ListNode;

public class _24_Swap_Nodes_in_Pairs {
    public static void main(String[] args) {
        ListNode node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(swapPairs(node));
    }

    private static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode tmp = dummy;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode node1 = tmp.next;
            ListNode node2 = tmp.next.next;
            tmp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            tmp = node1;
        }
        return dummy.next;
    }
}
