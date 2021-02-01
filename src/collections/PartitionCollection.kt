package collections

/**
 * Splits the original collection into pair of lists,
 * where *first* list contains elements for which [predicate] yielded `true`,
 * while *second* list contains elements for which [predicate] yielded `false`.*/
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }

    println(evenOdd)
    println(positives)
    println(negatives)
}