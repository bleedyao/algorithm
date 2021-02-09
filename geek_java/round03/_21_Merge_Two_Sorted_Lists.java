package round03;

import common.ListNode;

public class _21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        ListNode result = mergeTwoLists(ListNode.getSingleNode(), ListNode.getSingleNode());
        ListNode.printListNode(result);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                prev.next = l2;
                l2 = l2.next;
            } else {
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
