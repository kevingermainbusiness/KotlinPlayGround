package collections

object AnyAllNoneCollections {

    val numbers = listOf<Int>(1, -2, 3, -4, 5, -6)

    val anyNegative = numbers.any { it < 0 } // returns true

    val anyGreaterThan6 = numbers.any { it > 6 } // returns false

    val allEven = numbers.all { it % 2 == 0 } // returns false

    val allLess6 = numbers.all { it < 6 } // returns true

    val allGT6 = numbers.none { it > 6 } // returns true
}

fun main() {
    println(AnyAllNoneCollections.anyNegative)
    println(AnyAllNoneCollections.anyGreaterThan6)
    println(AnyAllNoneCollections.allEven)
    println(AnyAllNoneCollections.allLess6)
    println(AnyAllNoneCollections.allGT6)
}