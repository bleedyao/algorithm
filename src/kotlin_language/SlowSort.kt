package kotlin_language

fun bubbleSort(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr
    for (i in arr.indices) {
        for (j in i until arr.size) {
            if (arr[i] > arr[j]) {
                arr[i] = arr[j].also { arr[j] = arr[i] }
            }
        }
    }
    return arr
}

fun insertSort(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr
    for (i in 1 until arr.size) {
        val value = arr[i]
        var j = i - 1
        while (j >= 0) {
            if (arr[j] > value) {
                arr[j + 1] = arr[j]
            } else {
                break
            }
            j--
        }
        arr[j + 1] = value
    }
    return arr
}

fun selectSort(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr
    for (i in arr.indices) {
        var min = i
        for (j in i until arr.size) {
            if (arr[j] < arr[min]) {
                min = j
            }
        }
        if (min != i) {
            arr[i] = arr[min].also { arr[min] = arr[i] }
        }
    }
    return arr
}

fun main() {
    println(bubbleSort(intArrayOf(5, 4, 3, 2, 1)).contentToString())
    println(insertSort(intArrayOf(5, 4, 3, 2, 1)).contentToString())
    println(selectSort(intArrayOf(5, 4, 3, 2, 1)).contentToString())
}