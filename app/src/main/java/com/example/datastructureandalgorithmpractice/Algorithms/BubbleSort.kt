package com.example.datastructureandalgorithmpractice.Algorithms

fun bubbleSort(array: IntArray) {
    // Outer loop iterates over the array indices
    for (i in array.indices) {
        /* Inner loop compares adjacent elements of the array and swaps them if
         they are in the wrong order */
        for (j in 0 until array.size - 1) {
            // If the current element is greater than the next element, swap them
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}

fun main() {

    val numbers = intArrayOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0)
    bubbleSort(numbers)
    println(numbers.contentToString())
}