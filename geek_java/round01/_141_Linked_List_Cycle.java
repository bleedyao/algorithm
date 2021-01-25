package round01;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;

public class _141_Linked_List_Cycle {
    public static void main(String[] args) {
        ListNode node = ListNode.getCycleNode();
        System.out.println(hasCycle(node));
        node = ListNode.getSingleNode();
        System.out.println(hasCycle(node));

        node = ListNode.getCycleNode();
        System.out.println(hasCycle1(node));
        node = ListNode.getSingleNode();
        System.out.println(hasCycle1(node));
    }

    private static boolean hasCycle1(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
