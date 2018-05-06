import java.util.*

class MedianMaintenance {
    // container for items less than the median
    private val lesser = PriorityQueue<Int>({ a: Int, b: Int -> -1 * a.compareTo(b)}) // MAX_HEAP
    // container for items greater than the median
    private val higher = PriorityQueue<Int>() // MIN_HEAP

    private fun getCurrentMedian(): Int {
        return when {
            lesser.size == higher.size -> (lesser.peek() + higher.peek()) / 2
            lesser.size > higher.size -> lesser.peek()
            else -> higher.peek()
        }
    }

    private fun addToAppropriateHeap(n: Int) {
        when {
            lesser.size == 0 -> lesser.add(n)
            n < lesser.peek() -> lesser.add(n)
            else -> higher.add(n)
        }
    }

    private fun rebalanceHeaps() {
        if (Math.abs(lesser.size - higher.size) == 2) {
            val heapWithLessItems = if (lesser.size < higher.size) lesser else higher
            val heapWithMoreItems = if (lesser.size > higher.size) lesser else higher
            heapWithLessItems.add(heapWithMoreItems.poll())
        }
    }

    fun getMedian(n: Int): Int {
        addToAppropriateHeap(n)
        rebalanceHeaps()
        return getCurrentMedian()
    }
}

fun main(args: Array<String>) {
    val mm = MedianMaintenance()
    val stream: Array<Int> = arrayOf(5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4)
    val expectedAnswer = arrayOf(5, 10, 5, 4, 3, 4, 5, 6, 7, 6, 7, 6)

    val answer = stream.map { mm.getMedian(it) }.toTypedArray()

    if (answer contentEquals expectedAnswer) {
        println("Test passed!")
    } else {
        println("Test failed!")
    }
}