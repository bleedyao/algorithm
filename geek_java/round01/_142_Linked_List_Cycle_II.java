package round01;

import common.ListNode;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

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

        node = ListNode.getCycleNode();
        res = detectCycle1(node);
        if (res != null) {
            System.out.println(res.val);
        }
        node = ListNode.getSingleNode();
        res = detectCycle1(node);
        if (res != null) {
            System.out.println(res.val);
        }
    }

    private static ListNode detectCycle1(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow != fast) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                fast = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    private static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        Set<ListNode> set = new HashSet<>();
        while (head.next != null) {
            if (!set.add(head)) {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
