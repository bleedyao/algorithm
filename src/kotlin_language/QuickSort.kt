package kotlin_language

import java.util.*

fun mergeSort(arr: IntArray): IntArray {
    if (arr.size <= 1) return arr
    fun merge(arr: IntArray, f: Int, mid: Int, l: Int) {
        val tmpArr = IntArray(l - f + 1)
        var i = f
        var j = mid + 1
        var k = 0

        while (i <= mid && j <= l) {
            if (arr[i] < arr[j]) {
                tmpArr[k++] = arr[i++]
            } else {
                tmpArr[k++] = arr[j++]
            }
        }

        var start = i
        var end = mid
        if (j <= l) {
            start = j
            end = l
        }

        while (start <= end) {
            tmpArr[k++] = arr[start++]
        }

        for (i in 0..l - f) {
            arr[f + i] = tmpArr[i]
        }

    }

    fun mergeChild(arr: IntArray, f: Int, l: Int) {
        if (f >= l) return
        val mid = f + (l - f) / 2
        mergeChild(arr, f, mid)
        mergeChild(arr, mid + 1, l)

        merge(arr, f, mid, l)
    }
    mergeChild(arr, 0, arr.size - 1)
    return arr
}

fun quickSort(arr: IntArray): IntArray {
    fun pivot(arr: IntArray, f: Int, l: Int): Int {
        val p = arr[l]
        var i = f
        for (j in f until l) {
            if (arr[j] < p) {
                arr[i] = arr[j].also { arr[j] = arr[i] }
                i++
            }
        }
        arr[i] = arr[l].also { arr[l] = arr[i] }
        return i
    }

    fun partition(arr: IntArray, f: Int, l: Int) {
        if (f >= l) return
        val p = pivot(arr, f, l)
        partition(arr, f, p - 1)
        partition(arr, p + 1, l)
    }

    partition(arr, 0, arr.size - 1)
    return arr
}

fun main() {
    val testArr = IntArray(10_000_000)
    val r = Random()
    for (i in testArr.indices) {
        testArr[i] = r.nextInt()
    }
    Thread {
        val start = System.currentTimeMillis()
        mergeSort(testArr.clone())
        println("merge sort during time: ${System.currentTimeMillis() - start}")
    }.start()

    Thread {
        val start = System.currentTimeMillis()
        quickSort(testArr.clone())
        println("quick sort during time: ${System.currentTimeMillis() - start}")
    }.start()
    println(mergeSort(intArrayOf(5, 4, 3, 2, 1)).contentToString())
    println(quickSort(intArrayOf(5, 4, 3, 2, 1)).contentToString())
}