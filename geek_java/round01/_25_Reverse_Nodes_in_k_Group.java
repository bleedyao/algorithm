package round01;

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
        if (head == null || k < 1) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null) {
            ListNode tail = pre;
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) return dummy.next;
            }
            ListNode next = tail.next;
            ListNode[] reserved = reverseList(head, tail);
            head = reserved[0];
            tail = reserved[1];
            pre.next = head;
            tail.next = next;
            pre = tail;
            head = tail.next;
        }
        return dummy.next;
    }

    private static ListNode[] reverseList(ListNode head, ListNode tail) {
        if (head == null) return null;
        ListNode prev = tail.next;
        ListNode cur = head;
        while (prev != tail) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        return new ListNode[]{tail, head};
    }
}
