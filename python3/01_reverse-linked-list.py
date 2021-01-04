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
    def reverseList(self, head):
        prov, cur = None, head
        while cur:
            cur.next, prov, cur = prov, cur, cur.next
        return prov


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
result = Solution().reverseList(node01)
print('------------------')
displayNode(result)
