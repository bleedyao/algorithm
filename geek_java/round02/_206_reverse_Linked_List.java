package round02;

import common.ListNode;

public class _206_reverse_Linked_List {
    public static void main(String[] args) {
        ListNode node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(reverseLinkedList(node));
    }

    private static ListNode reverseLinkedList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
           ListNode tmp = cur.next;
           cur.next = pre;
           pre = cur;
           cur = tmp;
        }
        return pre;
    }
}
