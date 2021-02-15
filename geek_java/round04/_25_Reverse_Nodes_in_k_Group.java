package round04;

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
        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy, tail = dummy;
        while (head != null) {
            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) return dummy.next;
            }
            ListNode next = tail.next;
            ListNode[] reversed = reverseList(head, tail);
            head = reversed[0];
            tail = reversed[1];
            prev.next = head;
            tail.next = next;
            prev = tail;
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
