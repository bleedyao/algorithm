package round05;

import common.ListNode;

public class _141_Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode node = ListNode.getCycleNode();
        System.out.println(hasCycle(node));
        node = ListNode.getSingleNode();
        System.out.println(hasCycle(node));
    }

    private static boolean hasCycle(ListNode head) {
        return false;
    }
}
