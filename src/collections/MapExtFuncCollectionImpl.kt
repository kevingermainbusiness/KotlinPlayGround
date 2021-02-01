package collections

/***
 * @param map extension function enables you to apply a transformation
 * to all elements in a collection.
 * It takes a transformer function as a lambda-parameter.
 */

fun main(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val doubled = numbers.map { x -> x * 2 }

    val tripled = numbers.map { it * 3 }

    println(doubled)
    println(tripled)
}
