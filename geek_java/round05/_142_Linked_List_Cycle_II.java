package round05;

import common.ListNode;

public class _142_Linked_List_Cycle_II {

    public static void main(String[] args) {
        ListNode node = ListNode.getCycleNode();
        ListNode res = detectCycle(node);
        if (res != null) {
            System.out.println(res.val);
        }
        node = ListNode.getSingleNode();
        res = detectCycle(node);
        if (res != null) {
            System.out.println(res.val);
        }
    }

    private static ListNode detectCycle(ListNode head) {
        return null;
    }
}
