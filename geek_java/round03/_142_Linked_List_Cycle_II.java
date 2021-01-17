package round03;

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
        if (head == null) return null;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}
