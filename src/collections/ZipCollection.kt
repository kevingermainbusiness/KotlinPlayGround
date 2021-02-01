package collections

/**
 * zip function merges two given collections into a new collection.
 * By default, the result collection contains Pairs of source collection elements with the same index.
 * However, you can define own structure of the result collection element.
 * The size of the result collection equals to the minimum size of a source collection.
 * */
fun main() {
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    val resultPairs = A zip B
    val resultReduce = A.zip(B) { a, b -> "$a$b" }


    println(resultPairs)
    println(resultReduce)
}