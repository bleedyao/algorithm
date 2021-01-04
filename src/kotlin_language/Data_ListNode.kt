package kotlin_language

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun node5(): ListNode {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)

    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    return node1
}

fun nodeNull(): ListNode? {
    return null
}

fun node1(): ListNode {
    return ListNode(1)
}

fun node2(): ListNode {
    val node1 = ListNode(1)
    val node2 = ListNode(2)

    node1.next = node2
    return node1
}

fun showListNode(head: ListNode?) {
    var tmp = head
    while (tmp != null) {
        print(tmp.`val`)
        tmp = tmp.next
    }
    println()
}

fun main() {
    showListNode(node5())
}