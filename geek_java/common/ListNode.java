package common;

public class ListNode {
    int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
    }
    /**
     * 不能打印循环链表
     * */
    public static void printListNode(ListNode nodes) {
        while (nodes != null) {
            System.out.print(nodes.val + " ");
            nodes = nodes.next;
        }
        System.out.println();
    }

    public static ListNode getSingleNode() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        printListNode(node1);
    }
}