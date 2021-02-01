package collections

object FindFindLastCollections {

    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1

    val first = words.find { it.startsWith("some") } // returns something
    val last = words.findLast { it.startsWith("some") } // returns somehow

    val nothing = words.find { it.contains("nothing") } // returns null
}

fun main() {
    println(FindFindLastCollections.first)
    println(FindFindLastCollections.last)
    println(FindFindLastCollections.nothing)
}