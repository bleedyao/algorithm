package kotlin_language

/**
 * 堆的建立一般是从数组 index 为 1 的位置开始添加数据
 * */
class Heap(
        private val arr: IntArray
) {
    private var capacity = arr.size - 1

    init {
        buildHeap(arr)
    }

    private fun buildHeap(arr: IntArray) {
        for (i in arr.size shr 1 downTo 1) {
            var maxIndex = i
            if (2 * i < arr.size && arr[i] < arr[2 * i])
                maxIndex = 2 * i
            if (2 * i + 1 < arr.size && arr[2 * i + 1] > arr[maxIndex])
                maxIndex = 2 * i + 1
            if (maxIndex == 1)
                break
            arr[i] = arr[maxIndex].also { arr[maxIndex] = arr[i] }
        }
    }

    fun sort() {
        var tmp = capacity
        for (i in tmp downTo 1) {
            arr[1] = arr[i].also { arr[i] = arr[1] }
            heapify(arr, i - 1)
        }
    }

    private fun heapify(arr: IntArray, end: Int, start: Int = 1) {
        for (i in end shr 1 downTo start) {
            var maxIndex = i
            if (2 * i <= end && arr[i] < arr[2 * i])
                maxIndex = 2 * i
            if (2 * i + 1 <= end && arr[2 * i + 1] > arr[maxIndex])
                maxIndex = 2 * i + 1
            if (maxIndex == 1)
                break
            arr[i] = arr[maxIndex].also { arr[maxIndex] = arr[i] }
        }
    }

    fun insertHead(item: Int) {
        if (capacity >= arr.size) {
            return
        }
        arr[++capacity] = item
        heapify(arr, capacity)
    }

    fun deleteHead() {
        if (arr.size > 1) {
            arr[1] = arr[capacity].also { arr[capacity] = arr[1] }
            capacity--
        } else {
            return
        }
        heapify(arr, capacity)
    }

    fun showArray() {
        println(arr.contentToString())
    }
}

fun main() {
    val arr = intArrayOf(Int.MIN_VALUE, 7, 4, 9, 8, 3, 2, 6, 1, 5)
    val heap = Heap(arr.clone())
    heap.showArray()
    heap.sort()
    heap.showArray()
    println("-----------------------------------------------------")
    val heap1 = Heap(arr.clone())
    heap1.showArray()
    heap1.deleteHead()
    heap1.showArray()
    heap1.insertHead(10)
    heap1.showArray()
}