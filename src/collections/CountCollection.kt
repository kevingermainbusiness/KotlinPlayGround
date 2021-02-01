package collections

/**
 * count functions returns either the total number of elements in a collection
 * or the number of elements matching the given predicate.
 * */
object CountCollection {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }
}

fun main() {
    println(CountCollection.totalCount)
    println(CountCollection.evenCount)
}