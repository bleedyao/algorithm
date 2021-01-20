package template;

import common.ListNode;

public class _25_Reverse_Nodes_in_k_Group {
    public static void main(String[] args) {
        ListNode node = ListNode.getSingleNode();
        ListNode.printListNode(reverseKGroup(node, 2));
        node = ListNode.getSingleNode();
        ListNode.printListNode(reverseKGroup(node, 3));
        node = ListNode.getSingleNode();
        ListNode.printListNode(reverseKGroup(node, 4));
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        return null;
    }
}
