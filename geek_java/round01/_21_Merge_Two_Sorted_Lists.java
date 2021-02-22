package round01;

import common.ListNode;

public class _21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode result = mergeTwoLists(ListNode.getSingleNode(), ListNode.getSingleNode());
        ListNode.printListNode(result);

        ListNode result1 = mergeTwoLists1(ListNode.getSingleNode(), ListNode.getSingleNode());
        ListNode.printListNode(result1);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
