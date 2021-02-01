package collections

/**
 * These functions return the first and the last element of the collection correspondingly.
 * You can also use them with a predicate; in this case, they return the first or the last element
 * that matches the given predicate.
 * */
object FirstLastCollection {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }
}

fun main() {
    println(FirstLastCollection.first)
    println(FirstLastCollection.last)
    println(FirstLastCollection.firstEven)
    println(FirstLastCollection.lastOdd)
}