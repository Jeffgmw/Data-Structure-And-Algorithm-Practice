package algorithms.recursion.reverse_string

class ReverseString {

    fun reverseStringRecursive(str: String): String {
        return if (str == "")
            ""
        else
            reverseStringRecursive(str.substring(1)) + str[0]
    }

    fun reverseStringIterative(str: String): String {
        val charArray = str.toCharArray()
        for (i in 0 until charArray.size / 2) {
            val temp = charArray[i]
            charArray[i] = charArray[charArray.size - 1 - i]
            charArray[charArray.size - 1 - i] = temp
        }
        return String(charArray)
    }
}

fun main() {

    val reverse = ReverseString()
    println(reverse.reverseStringRecursive("mon mastery"))
    println(reverse.reverseStringIterative("mon mastery"))
}