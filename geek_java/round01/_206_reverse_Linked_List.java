package round01;

import common.ListNode;

public class _206_reverse_Linked_List {
    public static void main(String[] args) {
        ListNode node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(reverseLinkedList(node));

        node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(reverseLinkedList1(node));

        node = ListNode.getSingleNode();
        ListNode.printListNode(node);
        ListNode.printListNode(reverseLinkedList2(node));
    }

    private static ListNode reverseLinkedList2(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (head.next != null) {
            ListNode tmp = head.next.next;
            head.next.next = cur;
            cur = head.next;
            head.next = tmp;
        }
        return cur;
    }

    private static ListNode reverseLinkedList1(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ret = reverseLinkedList1(head.next);
        head.next.next = head;
        head.next = null;
        return ret;
    }

    private static ListNode reverseLinkedList(ListNode head) {
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
