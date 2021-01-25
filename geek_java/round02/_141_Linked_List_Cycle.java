package round02;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _141_Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode node = ListNode.getCycleNode();
        System.out.println(hasCycle(node));
        node = ListNode.getSingleNode();
        System.out.println(hasCycle(node));
    }

    private static boolean hasCycle(ListNode head) {
        if (head == null ) return false;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
