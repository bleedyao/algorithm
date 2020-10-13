package kotlin_language

class `206_reverse_linked_list` {
    companion object {
        fun reverseList(head: ListNode?): ListNode? {
            if (head == null) {
                return head
            }
            var prev: ListNode? = null
            var cur = head
            while (cur != null) {
                val tmp = cur.next
                cur.next = prev
                prev = cur
                cur = tmp
            }
            return prev
        }

        fun reverseList_v1(head: ListNode?): ListNode? {
            if (head?.next == null) return head
            val tmp = reverseList_v1(head.next)
            head.next?.next = head
            head.next = null
            return tmp
        }
    }
}

fun main() {
    showListNode(`206_reverse_linked_list`.reverseList(nodeNull()))
    showListNode(`206_reverse_linked_list`.reverseList(node1()))
    showListNode(`206_reverse_linked_list`.reverseList(node2()))
    showListNode(`206_reverse_linked_list`.reverseList(node5()))
    showListNode(`206_reverse_linked_list`.reverseList_v1(nodeNull()))
    showListNode(`206_reverse_linked_list`.reverseList_v1(node1()))
    showListNode(`206_reverse_linked_list`.reverseList_v1(node2()))
    showListNode(`206_reverse_linked_list`.reverseList_v1(node5()))
}