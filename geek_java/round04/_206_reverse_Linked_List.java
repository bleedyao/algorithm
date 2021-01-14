package round04;

import common.ListNode;

public class _206_reverse_Linked_List {
    public static void main(String[] args) {
        ListNode node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(reverseLinkedList(node));
    }

    private static ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ret = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return ret;
    }
}
