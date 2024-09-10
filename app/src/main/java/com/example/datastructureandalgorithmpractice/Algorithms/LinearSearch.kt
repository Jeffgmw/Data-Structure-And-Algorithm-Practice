package algorithms.searching.linear_search

class LinearSearch {

    fun linearSearch(arr: IntArray, key: Int): Int {
        for (i in arr.indices) {
            if (arr[i] == key) {
                return i
            }
        }
        return -1
    }
}

fun main() {

    val linearSearch = LinearSearch()
    val arr = intArrayOf(12, 45, 69, 78, 89, 54)
    val answer = linearSearch.linearSearch(arr, 69)
    println(answer)
}