# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


def displayNode(listNode):
    while listNode:
        print(listNode.val)
        listNode = listNode.next


class Solution:
    def hasCycle(self, head: ListNode) -> bool:
        fast = slow = head
        while fast and fast.next:
            slow, fast = slow.next, fast.next.next
            if slow is fast:
                return True
        return False

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

print(Solution().hasCycle(node01))
