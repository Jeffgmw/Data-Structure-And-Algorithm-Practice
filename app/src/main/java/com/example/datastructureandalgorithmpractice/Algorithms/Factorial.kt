package com.example.datastructureandalgorithmpractice.Algorithms

class Factorial {

    fun findFactorialRecursive(number: Int): Int {
        return if (number < 2)
            1
        else
            number * findFactorialRecursive(number - 1)
    }


    fun findFactorialIterative(number: Int): Int {
        return if (number < 2) {
            1
        } else {
            var answer = 1
            for (i in 2..number) {
                answer *= i
            }
            answer
        }
    }
}

fun main() {

    val factorial = Factorial()
    println(factorial.findFactorialRecursive(7))
    println(factorial.findFactorialIterative(5))
}