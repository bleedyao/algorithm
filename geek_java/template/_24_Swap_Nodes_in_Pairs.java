package template;

import common.ListNode;

public class _24_Swap_Nodes_in_Pairs {
    public static void main(String[] args) {
        ListNode node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(swapPairs(node));
    }

    private static ListNode swapPairs(ListNode head) {
        return head;
    }
}
