class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def displayNode(listNode):
    while listNode:
        print(listNode.val)
        listNode = listNode.next


class Solution:
    def detectCycle(self, head):
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                slow2 = head
                while slow != slow2:
                    slow = slow.next
                    slow2 = slow2.next
                return slow


node01 = ListNode(1)
node02 = ListNode(2)
node03 = ListNode(3)
node04 = ListNode(4)
node05 = ListNode(5)

node01.next = node02
node02.next = node03
node03.next = node04
node04.next = node05
node05.next = node03

# displayNode(node01)

print(Solution().detectCycle(node01))
