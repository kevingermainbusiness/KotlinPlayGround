package collections

/**
 * getOrElse provides safe access to elements of a collection.
 * It takes an index and a function that provides the default value
 * in cases when the index is out of bound.
 * */
fun main() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })

    map["x"] = 3
    println(map.getOrElse("x") { 1 })

    map["x"] = null
    println(map.getOrElse("x") { 1 })
}