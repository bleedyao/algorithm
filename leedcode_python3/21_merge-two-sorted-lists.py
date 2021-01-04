class ListNode:
    def __init__(self, x = 0, next = None):
        self.val = x
        self.next = None


def displayNode(listNode: ListNode):
    while listNode:
        print(listNode.val)
        listNode = listNode.next

class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        temp1, temp2, minNode, resultNode = l1, l2, None, None
        while temp1 or temp2:
            if temp1.val > temp2.val:
                minNode = temp2
                temp2 = temp2.next
            else:
                minNode = temp1
                temp1 = temp1.next
            if not resultNode:
                resultNode = minNode
            else:
                resultNode.next = minNode
        return resultNode

node01 = ListNode(1)
node02 = ListNode(2)
node03 = ListNode(3)
node04 = ListNode(4)
node05 = ListNode(5)

node01.next = node02
node02.next = node03
node03.next = node04
node04.next = node05

node001 = ListNode(1)
node002 = ListNode(2)
node003 = ListNode(3)
node004 = ListNode(4)
node005 = ListNode(5)

node001.next = node002
node002.next = node003
node003.next = node004
node004.next = node005

displayNode(Solution().mergeTwoLists(node01, node001))