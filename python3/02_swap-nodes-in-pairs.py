# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


def displayNode(listNode):
    while listNode:
        print(listNode.val)
        listNode = listNode.next


class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        pre, pre.next = self, head
        while pre.next and pre.next.next:
            a = pre.next
            b = a.next
            pre.next, b.next, a.next = b, a, b.next
            pre = a
        return self.next


node01 = ListNode(1)
node02 = ListNode(2)
node03 = ListNode(3)
node04 = ListNode(4)
node05 = ListNode(5)

node01.next = node02
node02.next = node03
node03.next = node04
node04.next = node05

displayNode(node01)
result = Solution().swapPairs(node01)
print('------------------')
displayNode(result)
