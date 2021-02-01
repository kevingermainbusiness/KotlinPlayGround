package collections

/**
 * flatMap transforms each element of a collection into an iterable object
 * and builds a single list of the transformation results.
 * The transformation is user-defined.
 * */
fun main() {

    val numbers = listOf(1, 2, 3)

    val tripled = numbers.flatMap { listOf(it, it, it) }

    println(tripled)
}