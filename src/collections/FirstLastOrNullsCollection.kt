package collections

/**
 * These functions work almost the same way with one difference:
 * they return null if there are no matching elements.
 * */
object FirstLastOrNullsCollection {

    private val words = listOf("foo", "bar", "baz", "faz")
    private val empty = emptyList<String>()
    val first = empty.firstOrNull() // returns null
    val last = empty.lastOrNull() // returns null
    val firstF = words.firstOrNull { it.startsWith('f') } // returns foo
    val firstZ = words.firstOrNull { it.startsWith('z') } // returns null
    val lastF = words.lastOrNull { it.endsWith('f') } // return null
    val lastZ = words.lastOrNull { it.endsWith('z') } // returns faz
}

fun main() {
    println(FirstLastOrNullsCollection.first)
    println(FirstLastOrNullsCollection.firstF)
    println(FirstLastOrNullsCollection.firstZ)
    println(FirstLastOrNullsCollection.last)
    println(FirstLastOrNullsCollection.lastF)
    println(FirstLastOrNullsCollection.lastZ)
}