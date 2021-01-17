package round05;

import common.ListNode;

public class _206_reverse_Linked_List {
    public static void main(String[] args) {
        ListNode node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(reverseLinkedList(node));
    }

    private static ListNode reverseLinkedList(ListNode head) {
        return head;
    }
}
