package round01;

import common.ListNode;

public class _2_Add_Two_Numbers {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode.printListNode(node1);
        ListNode node11 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node33 = new ListNode(4);
        node11.next = node22;
        node22.next = node33;
        ListNode.printListNode(node11);
        ListNode result = addTwoNumbers(node1, node11);
        ListNode.printListNode(result);

        System.out.println("---------------------------------");

        node1 = new ListNode(0);
        ListNode.printListNode(node1);
        node11 = new ListNode(0);
        ListNode.printListNode(node11);
        result = addTwoNumbers(node1, node11);
        ListNode.printListNode(result);

        System.out.println("----------------------------------");
        node1 = new ListNode(9);
        node2 = new ListNode(9);
        node3 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(9);
        ListNode node7 = new ListNode(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        ListNode.printListNode(node1);
        node11 = new ListNode(9);
        node22 = new ListNode(9);
        node33 = new ListNode(9);
        ListNode node44 = new ListNode(9);
        node11.next = node22;
        node22.next = node33;
        node33.next = node44;
        ListNode.printListNode(node11);
        result = addTwoNumbers(node1, node11);
        ListNode.printListNode(result);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int resVal = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            result.next = new ListNode(resVal % 10);
            carry = resVal / 10;
            l1 = (l1 == null ? null : l1.next);
            l2 = (l2 == null ? null : l2.next);
            result = result.next;
        }

        return head.next;

    }
}
