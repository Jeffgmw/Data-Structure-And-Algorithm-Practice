package com.example.datastructureandalgorithmpractice.Arrays

class DynamicArray (
    private var array: Array<String?> = arrayOfNulls(1),
    private var capacity: Int = 1,
    var length: Int = 0
){

    fun get(index: Int): String?{
        return if (index> -1 && index<length)array[index] else "IndexOutBounds"
    }

    fun push (string: String) {
        if (length == capacity){
            val tempArray = arrayOfNulls<String>(2*capacity)
            for (i in array.indices){
                tempArray[i] = array[i]
            }
            array = tempArray
            capacity *= 2
        }
        array[length] = string
        length++
    }

    fun replace (index: Int, value:String){
        if (index > -1 && index < length)
            array[index] = value
        else
            println("indexOutBounds")
    }

    fun pop(){
        if (length>0){
            length--
        }
    }

    fun delete(index: Int) {
        if (index > -1 && index < length) {
            if (index == length - 1) {
                pop()
            } else {
                for (i in index until length) {
                    array[i] = array[i + 1]
                }
                length--
            }
        } else {
            println("IndexOutOfBounds")
        }
    }

    fun array (): Array<String?> {
        val tempArr = arrayOfNulls<String>(length)
        for (i in 0 until length) {
            tempArr[i] = array[i]
        }
        return tempArr
    }

}

fun main(){
    val dynamicArray = DynamicArray()
    dynamicArray.push("apples")
    dynamicArray.push("ball")
    dynamicArray.push("dog")
    dynamicArray.push("cat")

    println("Array length: " + dynamicArray.length)
    println("array: " + dynamicArray.array().contentToString())
    println("Index 2 item: " + dynamicArray.get(2))

    dynamicArray.replace(1, "Whaat")
    println("array: " + dynamicArray    .array().contentToString())

    dynamicArray.pop()
    println("Array: " + dynamicArray.array().contentToString())

    dynamicArray.delete(1)
    println(" Array: " + dynamicArray.array().contentToString())


}